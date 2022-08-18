package GWJava;

import CandidateManager.Candidate;
import CandidateManager.JDateLabelFormat;
import CandidateManager.XUtil;
import com.lib.XFile;
import lec20.MenuCardGUI;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

public class GWJAVA extends JFrame{
    private JPanel mainPanel;
    private JMenuItem newMenuItem;
    private JMenuItem openMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem saveAsMenuItem;
    private JPanel leftSide;
    private JLabel homeLabel;
    private JLabel StudentLabel;
    private JPanel contentSide;
    private JPanel homePanel;
    private JPanel StudentPanel;
    private JLabel GradeLabel;
    private JPanel GradePanel;
    private JEditorPane editorPane1;
    private JTextField txtID;
    private JTextField txtName;
    private JTextField txtMath;
    private JTextField txtPhy;
    private JTextField txtChe;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JComboBox cbMainMajor;
    private JButton newButton;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton uploadButton;
    private JButton sortByNameButton;
    private JTable tbCan;
    private JButton sortByAverageScoresButton;
    private JDatePickerImpl JDatePickerImpl1;
    CardLayout cardLayout;
    String  fPath;
    DefaultTableModel modelTable;
    List<Candidate> listCan;
    String file = "Candidate.dat";
    int row;
    public GWJAVA(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        this.setContentPane(mainPanel);//set main Frame panel
        this.setLocationRelativeTo(null);
        this.setSize(800, 600);
        cardLayout = (CardLayout) contentSide.getLayout();
        tbCan.setModel(new DefaultTableModel(
                new Object[] []{}, new String[] {
                "ID", "Name", "Math", "Phy", "Che", "Gender", "Major", "BDay"
        }
        ));
        modelTable = (DefaultTableModel) tbCan.getModel();

        listCan = (List<Candidate>) XFile.readObject(file);
        if(listCan.size() == 0) {
            listCan.add(new Candidate("GCC200104", "The Nguyen", 9.0, 9.0, 9.0, true, "2002-09-26"));
        }
        //fill list to JTable
        fillToTable();
        //show all information to form -> showDetails
        showDetail(row);
        homeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                cardLayout.show(contentSide, "cardHome");
            }
        });
        StudentLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                cardLayout.show(contentSide, "cardstd");
            }
        });

        GradeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                cardLayout.show(contentSide, "cardGrade");
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser(
                        FileSystemView.getFileSystemView().getHomeDirectory()
                );
                int result = fc.showOpenDialog(GWJAVA.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    fPath = fc.getSelectedFile().getPath();
                    String data = XFile.readBuffer(fPath);
                    editorPane1.setText(data);
                }
            }
        });

        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(GWJAVA.this, "Do you want to create new?", "Create new",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    editorPane1.setText("");
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                XFile.writeBuffer(fPath, editorPane1.getText());
//                System.out.println("Saved Successfully: " + fPath);

            }
        });

        saveAsMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
//                JFileChooser fc = new JFileChooser(fPath);
                int result = fc.showSaveDialog(GWJAVA.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    fPath = fc.getSelectedFile().getPath();
//                    XFile.writeBuffer(fPath, editorPane1.getText());
//                    System.out.println("Saved Successfully: " + fPath);
                }
            }
        });
    }

    private void showDetail(int row) {
        String sID = (String) tbCan.getValueAt(row, 0);
        txtID.setText(sID);
        String name = (String) tbCan.getValueAt(row, 1);
        txtName.setText(name);
        Double math = (Double) tbCan.getValueAt(row, 2);
        txtMath.setText(math.toString());
        Double phy = (Double) tbCan.getValueAt(row, 3);
        txtPhy.setText(phy.toString());
        Double che = (Double) tbCan.getValueAt(row, 4);
        txtChe.setText(che.toString());
        Boolean gender = (Boolean) tbCan.getValueAt(row, 5);
        maleRadioButton.setSelected(gender);
        femaleRadioButton.setSelected(!gender);
        String bDay = (String) tbCan.getValueAt(row, 7);
        Calendar c = Calendar.getInstance();
        c.setTime(XUtil.convertStringToDate(bDay));
        JDatePickerImpl1.getJFormattedTextField().setValue(c);
    }

    public static void main (String[]args){
            JFrame fr = new GWJAVA("Main Frame");
            fr.setVisible(true);
        }
    private void fillToTable() {
        modelTable.setRowCount(0);// clear old data
        for(Candidate c : listCan){
            //get c
            //object [] row
            Object[] row = new Object[] {c.getID(), c.getName(), c.getMath(), c.getPhy(), c.getChemis(),
                    c.getGender(), "IT", XUtil.convertDateToString(c.getBday())
            };
            //add object -> modelTable
            modelTable.addRow(row);
        }
    }
    private void createUIComponents() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl1 = new JDatePickerImpl(datePanel, new JDateLabelFormat());
        // TODO: place custom component creation code here
    }
}

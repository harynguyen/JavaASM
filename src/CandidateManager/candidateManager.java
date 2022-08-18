package CandidateManager;

import com.lib.XFile;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

public class candidateManager  extends JFrame{
    private JTextField txtID;
    private JTextField txtName;
    private JTextField txtMath;
    private JTextField txtPhy;
    private JTextField txtChe;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JComboBox cbMainMajor;
    private JTextField txtBday;
    private JButton newButton;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton uploadButton;
    private JButton sortByNameButton;
    private JButton sortByAverageScoresButton;
    private JPanel mainPanel;
    private JTable tbCan;
    private JDatePickerImpl JDatePickerImpl1;
    DefaultTableModel modelTable;
    List<Candidate> listCan;
    String file = "Candidate.dat";
    int row;

    public candidateManager(String title) throws HeadlessException{
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800,450);
        this.setLocationRelativeTo(null);
        tbCan.setModel(new DefaultTableModel(
                new Object[] []{}, new String[] {
                        "ID", "Name", "Math", "Phy", "Che", "Gender", "Major", "BDay"
        }
        ));
        modelTable = (DefaultTableModel) tbCan.getModel();

        listCan = (List<Candidate>) XFile.readObject(file);
        if(listCan.size() == 0) {
            listCan.add(new Candidate("GCC200104", "The Nguyen", 9.0, 9.0, 9.0, true, "2002-02-26"));
        }
        //fill list to JTable
        fillToTable();
        //show all information to form -> showDetails
        showDetail(row);
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

    public static void main(String[] args) {
        JFrame c = new candidateManager("This is a simple demo of java swing");
        c.setVisible(true);
        c.setResizable(false);
    }

    private void createUIComponents() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl1 = new JDatePickerImpl(datePanel, new JDateLabelFormat());
    }
}

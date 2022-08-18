package lec20;

import com.lib.XFile;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;

public class MenuCardGUI extends JFrame{
    private JPanel mainPanel;
    private JRadioButton redRadioButton;
    private JRadioButton blueRadioButton;
    private JRadioButton yellowRadioButton;
    private JCheckBox customCheckBox;
    private JTextField txtStatus;
    private JPanel leftSide;
    private JPanel contentSide;
    private JLabel homeLabel;
    private JLabel editorTextLabel;
    private JPanel homePanel;
    private JPanel textPanel;
    private JEditorPane editorPane1;
    private JMenuItem openMenuItem;
    private JMenuItem newMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem saveAsMenuItem;
    CardLayout cardLayout;
    String fPath; // this is save file path

    public MenuCardGUI(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        this.setContentPane(mainPanel);//set main Frame panel
        this.setLocationRelativeTo(null);
        this.setSize(800, 600);
        cardLayout = (CardLayout) contentSide.getLayout();
        homeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cardLayout.show(contentSide, "carHome");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblExited(homeLabel);
            }
        });
        homeLabel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                lblMoved(homeLabel);
            }
        });

        editorTextLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(contentSide, "cardText");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }
        });
        redRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtStatus.setForeground(Color.RED);
            }
        });
        blueRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtStatus.setForeground(Color.BLUE);
            }
        });
        yellowRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtStatus.setForeground(Color.YELLOW);
            }
        });
        customCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose your background color", Color.white);
                txtStatus.setForeground(color);
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser(
                        FileSystemView.getFileSystemView().getHomeDirectory()
                );
                int result = fc.showOpenDialog(MenuCardGUI.this);
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
                int choice = JOptionPane.showConfirmDialog(MenuCardGUI.this, "Do you want to create new?", "Create new",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION){
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
                int result = fc.showSaveDialog(MenuCardGUI.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    fPath = fc.getSelectedFile().getPath();
//                    XFile.writeBuffer(fPath, editorPane1.getText());
//                    System.out.println("Saved Successfully: " + fPath);
                }
            }
        });
    }
    private void lblExited(JLabel color) {
        Color fore = new Color(0, 0, 0);
        Color background = new Color(249,253,252,255);

        color.setForeground(fore);
        color.setBackground(background);
        color.setOpaque(true);
    }

    private void lblMoved(JLabel color) {
        Color fore = new Color(255, 255, 255);
        Color background = new Color(48, 178, 6);
        color.setForeground(fore);
        color.setBackground(background);
        color.setOpaque(true);
    }

    public static void main(String[] args){
        JFrame fr = new MenuCardGUI("Main Frame");
        fr.setVisible(true);
    }
}

package lab8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class StudentDetail extends JFrame{
    private JPanel mainPanel;
    private JTextField txtFullname;
    private JTextField txtAddress;
    private JCheckBox footballCheckBox;
    private JCheckBox readingCheckBox;
    private JCheckBox playingGamesCheckBox;
    private JButton showInfoButton;
    private JButton resetButton;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;

    public StudentDetail(String title) throws HeadlessException {
    super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        this.setContentPane(mainPanel);//set main Frame panel
        this.setLocationRelativeTo(null);
        this.pack();
        showInfoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String name = txtFullname.getText();
                String address = txtAddress.getText();
            }
        });
    }
    public static void main(String[] args) {
        JFrame fr = new StudentDetail("Welcome to my application");
        fr.setVisible(true);
    }
}

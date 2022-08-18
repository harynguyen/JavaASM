package lab10;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListOfStudent extends JFrame {
    private JList listStudent;
    private JTextField txtBlue;
    private JTextField txtRed;
    private JComboBox cbMajor;
    private JTextField txtMajorNo;
    private JTextField txtMajorName;
    private JButton addButton;
    private JButton removeButton;
    String fPath; // this is save file path
    private JPanel ListOfStudent;
    DefaultListModel modelList;
    DefaultComboBoxModel modelCb;

    public ListOfStudent(String title) {
        super(title);
        this.setContentPane(ListOfStudent);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        //listStudent.setModel(modelList);
        modelCb = (DefaultComboBoxModel) cbMajor.getModel();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    public static void main(String[] args) {
        JFrame fr = new ListOfStudent("List of Students");
        fr.setVisible(true);
    }
}

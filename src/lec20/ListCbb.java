package lec20;

import javax.swing.*;
import java.awt.event.*;


public class ListCbb extends JFrame{
    private JList listStudent;
    private JTextField txtName;
    private JTextField txtMajor;
    private JComboBox cbMajor;
    private JButton addButton;
    private JButton removeButton;
    private JPanel mainPanel;
    DefaultListModel modelList;
    DefaultComboBoxModel modelCb;

    public ListCbb(String title) {
        super(title);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        modelList = new DefaultListModel();
        listStudent.setModel(modelList);

        modelCb = (DefaultComboBoxModel) cbMajor.getModel();
        txtName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if(!modelList.contains(txtName.getText())) {
                        modelList.addElement(txtName.getText());
                        txtName.setText("");
                    }
                }
            }
        });
        listStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                String name = (String) listStudent.getSelectedValue();
                txtName.setText(name);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelCb.addElement(txtMajor.getText());
                txtMajor.setText("");

            }
        });
        cbMajor.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    String major = cbMajor.getSelectedItem().toString();
                    txtMajor.setText(major);
                }
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listStudent.getSelectedIndex();
                if (index >= 0) {
                    modelList.remove(index);
                }
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        JFrame fr = new ListCbb("List of Students");
        fr.setVisible(true);
    }
}

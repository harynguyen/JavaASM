package lec20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DemoGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField txtUser;
    private JButton clickMeButton;
    private JButton showPasswordButton;
    private JButton inputButton;
    private JButton confirmButton;
    private JButton optionButton;
    private JTextField txtWelcome;
    private JTextField txtPwd;
    private JCheckBox cherryCheckBox;
    private JCheckBox bobaCheckBox;
    private JRadioButton sizeMRadioButton;
    private JRadioButton sizeLRadioButton;

    public DemoGUI(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit button
        this.setContentPane(mainPanel);//set main Frame panel
        this.setLocationRelativeTo(null);
        this.pack();
        topping = new ArrayList<>();
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtUser.getText();
                txtWelcome.setText(name);
            }
        });
        showPasswordButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String pass = txtPwd.getText();
//                JOptionPane.showMessageDialog(Project1.this, pass);
                showMess(pass);
            }
        });
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("What is your fav food?");
                if (input.length() > 0) {
                    showMess(input);
                }
            }
        });
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showConfirm();
            }
        });
        optionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showOption();
            }
        });
        cherryCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topping.add(cherryCheckBox.getActionCommand()); //is selected()
            }
        });
        bobaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                topping.add(bobaCheckBox.getActionCommand());//is selected()
            }
        });
    }
    List<String> topping;
    private void showOption() {
        String[] option = {"Milk tea", "Mocha", "Latte", "Capu"};
        int code = JOptionPane.showOptionDialog(this, "What drink do you prefer?", "Menu", 0,JOptionPane.QUESTION_MESSAGE, null, option, "Capu");
        showMess(String.valueOf(code));
        showMess(option[code]);
        String mess = String.format("%s choose %s %s \n", txtUser.getText(), option[code], (topping.size() <= 0 ? "" : "with " + topping.toString()));
        if(sizeMRadioButton.isSelected()) {
            mess = mess.concat(sizeMRadioButton.getText());
        } else {
            mess = mess.concat(sizeLRadioButton.getText());
        }
        showMess(mess);
    }

    private void showConfirm() {
        int result = JOptionPane.showConfirmDialog(this, "Do you wanna exit?","Exit?",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, "Ok!");
        }
    }

    private void showMess(String input) {
        JOptionPane.showMessageDialog(this, input);
    }

    public static void main(String[] args) {
        JFrame fr = new DemoGUI("Main Frame");
        fr.setVisible(true);
    }
}

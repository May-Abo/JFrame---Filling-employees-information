package com.pioneer.employee;

import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {

        String password;
        password = JOptionPane.showInputDialog("Enter Password");
        if (!"123456".equals(password)) {
            do {
                password = JOptionPane.showInputDialog("Wrong Password try again");
            } while (!"123456".equals(password));
        }

        NewJFrame.main(args);

    }

}

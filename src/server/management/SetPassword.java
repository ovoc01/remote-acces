package server.management;

import server.listener.PassListener;

import javax.swing.*;
import java.awt.*;

public class SetPassword extends JFrame {
    static String port = "4907";
    JButton SUBMIT;
    JPanel panel;
    JLabel label1, label2;
    JTextField text1, text2;
    String value1;
    String value2;
    JLabel label;


    public static void main(String[] args) {
        SetPassword frame1 = new SetPassword();
        frame1.setSize(300, 80);
        frame1.setLocation(500, 300);
        frame1.setVisible(true);
    }
    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        SetPassword.port = port;
    }

    public JButton getSUBMIT() {
        return SUBMIT;
    }

    public void setSUBMIT(JButton SUBMIT) {
        this.SUBMIT = SUBMIT;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JTextField getText1() {
        return text1;
    }

    public void setText1(JTextField text1) {
        this.text1 = text1;
    }

    public JTextField getText2() {
        return text2;
    }

    public void setText2(JTextField text2) {
        this.text2 = text2;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public SetPassword() {
        label1 = new JLabel();
        label1.setText("Set Password");
        text1 = new JTextField(15);

        label = new JLabel();
        label.setText("");

        this.setLayout(new BorderLayout());

        SUBMIT = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(2, 1));
        panel.add(label1);
        panel.add(text1);

        panel.add(label);
        panel.add(SUBMIT);
        add(panel, BorderLayout.CENTER);
        SUBMIT.addActionListener(new PassListener(this));
        setTitle("Set Password to connect to the Client");
    }
}

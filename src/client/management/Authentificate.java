package client.management;

import client.listener.AuthentificateListener;

import javax.swing.*;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Authentificate extends JFrame{
    Socket cSocket = null;
    DataOutputStream psswrchk = null;
    DataInputStream verification = null;
    String verify = "";
    JButton SUBMIT;
    JPanel panel;
    JLabel label, label1;
    public String width = "", height = "";
    final JTextField text1;

    public Socket getcSocket() {
        return cSocket;
    }

    public void setcSocket(Socket cSocket) {
        this.cSocket = cSocket;
    }

    public DataOutputStream getPsswrchk() {
        return psswrchk;
    }

    public void setPsswrchk(DataOutputStream psswrchk) {
        this.psswrchk = psswrchk;
    }

    public DataInputStream getVerification() {
        return verification;
    }

    public void setVerification(DataInputStream verification) {
        this.verification = verification;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
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

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }


    public void setWidth(String width) {
        this.width = width;
    }


    public void setHeight(String height) {
        this.height = height;
    }

    public JTextField getText1() {
        return text1;
    }

    public Authentificate(Socket cSocket) {
        label1 = new JLabel();
        label1.setText("Password");
        text1 = new JTextField(15);
        this.cSocket = cSocket;

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
        SUBMIT.addActionListener(new AuthentificateListener(this));
        setTitle("LOGIN FORM");
    }


}

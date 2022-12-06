package server.listener;

import server.init.InitConnection;
import server.management.SetPassword;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassListener implements ActionListener {
    SetPassword setPassword;
    public PassListener(SetPassword pass){
        setPassword  =pass;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setPassword.setValue1( setPassword.getText1().getText());
        setPassword.dispose();
        new InitConnection(Integer.parseInt(SetPassword.getPort()), setPassword.getValue1());
    }
}

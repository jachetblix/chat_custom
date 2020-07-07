package com.egorovnaumenko.chat.client.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatView implements ActionListener {

    private JFrame jf;
    private JTextField field;
    private Cursor cursor;
    private JTextArea area;
    private JButton button;
    private JButton clear;
    private Panel panel;
    private Dimension d;
    private Toolkit toolkit;
    private ScrollPane sp;
    private List clientList;

    public void createUI(String clientId) {
        jf = new JFrame("Client " + clientId);
        field = new JTextField(20);
        cursor = new Cursor(Cursor.TEXT_CURSOR);
        field.requestFocusInWindow();
        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Times New Roman", 0, 14));
        button = new JButton("Send");
        clear = new JButton("Clear");

        sp = new ScrollPane();
        sp.add(area);

        clientList = new List();

        panel = new Panel();
        panel.add(field);
        panel.add(button);
        panel.add(clear);
        jf.add(sp, "Center");
        jf.add(panel, "South");
        jf.add(clientList, "East");
        toolkit = jf.getToolkit();
        d = toolkit.getScreenSize();
        jf.setBounds(d.width / 2 - 268, d.height / 2 - 163, 650, 327);

        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Send")) {
            String s = field.getText();
            System.out.println("SEND CLICK");
//            writeSocket(s);
        }
        if (e.getActionCommand().equals("Clear")) {
            area.setText("");
            System.out.println("CLEAR CLICK");
        }
    }
}

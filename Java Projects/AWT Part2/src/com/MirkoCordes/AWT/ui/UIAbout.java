package com.MirkoCordes.AWT.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UIAbout extends Frame {

    Panel panel_content;

    Label label_name;
    Label label_name_text;

    Button button_close;

    public UIAbout(){
        super("About");

        this.setSize(300, 100);

        this.initComponents();
        this.initListener();

        this.setVisible(true);
    }

    private void initComponents(){
        this.panel_content = new Panel(null);

        this.label_name = new Label("Name: ");
        this.label_name_text = new Label("Nice DUDE!");

        this.button_close = new Button("Schließen");

        this.label_name.setBounds(5,5, 45, 25);
        this.label_name_text.setBounds(50,5, 100, 25);

        this.button_close.setBounds(5, 30, 100, 25);

        this.add(panel_content);
        this.panel_content.add(label_name);
        this.panel_content.add(label_name_text);
        this.panel_content.add(button_close);
    }

    private void initListener(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        });

        this.button_close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    public static Frame create(){
        UIAbout f = new UIAbout();
        return f;
    }
}

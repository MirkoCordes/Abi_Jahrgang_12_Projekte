package com.MirkoCordes.AWTKleinprojekt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InfoInterface extends Frame {

    private InfoInterface instance;

    private Panel canvas;
    private Label info_title;
    private Label info_text;
    private Button button_accept;

    public InfoInterface(){
        super("Infoblatt");

        instance = this;

        this.setSize(600, 210);

        this.initComponents();
        this.initListener();
    }



    public void initComponents(){
        this.canvas = new Panel(null);
        this.info_title = new Label("INFOBLATT");
        this.info_text = new Label("Dieser Taschenrechner kann lediglich zwei Werte miteinander verrechnen.");
        this.button_accept = new Button("Verstanden!") ;

        this.info_title.setBounds(10,10, 550, 50);
        this.info_text.setBounds(10,60,550,50);
        this.button_accept.setBounds(10,110,560,50);

        this.add(canvas);
        this.canvas.add(info_title);
        this.canvas.add(info_text);
        this.canvas.add(button_accept);
    }

    public void initListener(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                instance.setVisible(false);
                UserInterface ui = new UserInterface();
                ui.setVisible(true);
            }
        });

        this.button_accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                instance.setVisible(false);
                UserInterface ui = new UserInterface();
                ui.setVisible(true);
            }
        });
    }
}

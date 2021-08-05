package com.MirkoCordes.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTWindowTest extends Frame {

    //Komponenten
    private Panel panel_canvas;
    private Button button_test;

    public AWTWindowTest(){
        //Fenstertitel
        super("Test Window Title");
        //Fenstergröße festlegen
        this.setSize(640, 480);

        this.initComponents();
        this.initListeners();

    }

    public void initComponents(){
        //Create
        this.panel_canvas = new Panel(null);
        this.button_test = new Button("Buttontitel");

        //Add canvas
        this.add(panel_canvas);

        //setBounds => Grenzen festlegen
        this.button_test.setBounds(10, 10, 100, 20);

        //Add Components
        this.panel_canvas.add(button_test);
    }

    //Listener wartet auf Klicken des Buttons und gibt einen Text im Shell aus 
    public void initListeners(){
        this.button_test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button wurde geklickt!");
            }
        });
    }
}

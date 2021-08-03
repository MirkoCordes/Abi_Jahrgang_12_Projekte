package com.MirkoCordes.AWTKleinprojekt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UserInterface extends Frame {

    private boolean change;
    private boolean commaUsed;

    //Komponenten
    private Panel canvas;               //Leinwand
    private Label label_returnity;      //Ausgabefeld
    // Type in
    private TextField textField_in_1;     //erstes Eingabefeld
    private TextField textField_in_2;     //zweites Eingabefeld
    private Label label_operator;      //Benutzter Operator
    //Numbers
    private Button button_number_1;
    private Button button_number_2;
    private Button button_number_3;
    private Button button_number_4;
    private Button button_number_5;
    private Button button_number_6;
    private Button button_number_7;
    private Button button_number_8;
    private Button button_number_9;
    private Button button_number_0;
    //to calculate
    private Button button_add_plus;
    private Button button_add_minus;
    private Button button_add_divide;
    private Button button_add_multiply;
    private Button button_calculate;
    //Extra Buttons
    private Button button_add_comma;    //Komma hinzufügen
    private Button button_clear;        //Eingabe löschen

    public UserInterface(){
        super("der TASCHENRECHNER");

        change = false;
        commaUsed = false;

        this.setSize(600, 800);

        Font font = new Font("Arial", Font.BOLD, 20);
        this.setFont(font);

        this.initComponents();
        this.initListener();
    }

    private void initComponents(){
        //init Components
        this.canvas = new Panel(null);
        this.textField_in_1 = new TextField();
        this.textField_in_2 = new TextField();
        this.label_operator = new Label("+");
        this.label_returnity = new Label("= 0");
            // => Numbers
        this.button_number_1 = new Button("1");
        this.button_number_2 = new Button("2");
        this.button_number_3 = new Button("3");
        this.button_number_4 = new Button("4");
        this.button_number_5 = new Button("5");
        this.button_number_6 = new Button("6");
        this.button_number_7 = new Button("7");
        this.button_number_8 = new Button("8");
        this.button_number_9 = new Button("9");
        this.button_number_0 = new Button("0");
            // => to calculate
        this.button_add_plus = new Button("+");
        this.button_add_minus = new Button("-");
        this.button_add_multiply = new Button("*");
        this.button_add_divide = new Button("/");
        this.button_calculate = new Button("=");
            // => extra buttons
        this.button_add_comma = new Button(",");
        this.button_clear = new Button("CE");


        //set Bounds => (max-width: 600) (max-height: 700)
            //Components
        this.textField_in_1.setBounds(0,0, 250, 50);
        this.textField_in_2.setBounds(350,0, 250, 50);
        this.label_operator.setBounds(250,0, 100, 50);

        this.label_returnity.setBounds(10,50, 440, 100);
            // => Numbers
        this.button_number_1.setBounds(0, 150, 150, 150);
        this.button_number_2.setBounds(150, 150, 150, 150);
        this.button_number_3.setBounds(300, 150, 150, 150);
        this.button_number_4.setBounds(0, 300, 150, 150);
        this.button_number_5.setBounds(150, 300, 150, 150);
        this.button_number_6.setBounds(300, 300, 150, 150);
        this.button_number_7.setBounds(0, 450, 150, 150);
        this.button_number_8.setBounds(150, 450, 150, 150);
        this.button_number_9.setBounds(300, 450, 150, 150);
        this.button_number_0.setBounds(150, 600, 150, 150);
            // => to calculate
        this.button_add_plus.setBounds(450, 150, 150, 150);
        this.button_add_minus.setBounds(450, 300, 150, 150);
        this.button_add_multiply.setBounds(450, 450, 150, 150);
        this.button_add_divide.setBounds(450, 600, 150, 150);
        this.button_calculate.setBounds(0, 600, 150, 150);
            // => extra buttons
        this.button_add_comma.setBounds(300, 600, 150, 150);
        this.button_clear.setBounds(450, 50, 150, 100);


        //Show components
        this.add(canvas);
        this.canvas.add(textField_in_1);
        this.canvas.add(label_operator);
        this.canvas.add(textField_in_2);
        this.canvas.add(label_returnity);
            // => Numbers
        this.canvas.add(button_number_1);
        this.canvas.add(button_number_2);
        this.canvas.add(button_number_3);
        this.canvas.add(button_number_4);
        this.canvas.add(button_number_5);
        this.canvas.add(button_number_6);
        this.canvas.add(button_number_7);
        this.canvas.add(button_number_8);
        this.canvas.add(button_number_9);
        this.canvas.add(button_number_0);
            // => to calculate
        this.canvas.add(button_add_plus);
        this.canvas.add(button_add_minus);
        this.canvas.add(button_add_multiply);
        this.canvas.add(button_add_divide);
        this.canvas.add(button_calculate);
            // => extra buttons
        this.canvas.add(button_add_comma);
        this.canvas.add(button_clear);
    }

    private void initListener(){
        //Fensterschließen erlauben
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //ändere Operatoren
            //Hier Addieren
        this.button_add_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_operator.setText("+");
                change = true;
            }
        });
            //Hier Subtrahieren
        this.button_add_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_operator.setText("-");
                change = true;
            }
        });
            //Hier Dividieren
        this.button_add_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_operator.setText("/");
                change = true;
            }
        });
            //Hier Multiplizieren
        this.button_add_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label_operator.setText("*");
                change = true;
            }
        });

        //Weise Nummern zu
        this.button_number_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "1");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "1");
                }
            }
        });
        this.button_number_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "2");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "2");
                }
            }
        });
        this.button_number_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "3");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "3");
                }
            }
        });
        this.button_number_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "4");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "4");
                }
            }
        });
        this.button_number_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "5");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "5");
                }
            }
        });
        this.button_number_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "6");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "6");
                }
            }
        });
        this.button_number_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "7");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "7");
                }
            }
        });
        this.button_number_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "8");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "8");
                }
            }
        });
        this.button_number_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "9");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "9");
                }
            }
        });
        this.button_number_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + "0");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + "0");
                }
            }
        });

        //füge Komma hinzu
        this.button_add_comma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commaUsed = true;
                if(!change){
                    textField_in_1.setText(textField_in_1.getText() + ".");
                } else {
                    textField_in_2.setText(textField_in_2.getText() + ".");
                }
            }
        });


        //Berechne Eingabe
        this.button_calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change = false;

                //String inputStringOne = textField_in_1.getText();
                //String inputStringTwo = textField_in_2.getText();
                String operator = label_operator.getText();

                if(commaUsed){
                    double valueOne = Double.parseDouble(textField_in_1.getText());
                    double valueTwo = Double.parseDouble(textField_in_2.getText());
                    double ergebnis;
                    if(operator == "-"){
                        ergebnis = valueOne - valueTwo;
                    } else if(operator == "*"){
                        ergebnis = valueOne * valueTwo;
                    } else if(operator == "/"){
                        ergebnis = valueOne / valueTwo;
                    } else {
                        ergebnis = valueOne + valueTwo;
                    }
                    label_returnity.setText(valueOne + operator + valueTwo + " = " + ergebnis);
                } else {
                    int valueOne = Integer.parseInt(textField_in_1.getText());
                    int valueTwo = Integer.parseInt(textField_in_2.getText());
                    int ergebnis;

                    if(operator == "-"){
                        ergebnis = valueOne - valueTwo;
                    } else if(operator == "*"){
                        ergebnis = valueOne * valueTwo;
                    } else if(operator == "/"){
                        ergebnis = valueOne / valueTwo;
                    } else {
                        ergebnis = valueOne + valueTwo;
                    }
                    label_returnity.setText(valueOne + operator + valueTwo + " = " + ergebnis);
                }
                textField_in_1.setText("");
                textField_in_2.setText("");
                label_operator.setText("+");
                commaUsed = false;
            }
        });

        this.button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                change = false;
                commaUsed = false;
                textField_in_1.setText("");
                textField_in_2.setText("");
                label_operator.setText("+");
                label_returnity.setText("= 0");
            }
        });
    }
}

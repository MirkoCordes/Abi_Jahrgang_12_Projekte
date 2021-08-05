package com.MirkoCordes.AWT.ui;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class UINotepad extends Frame implements ClipboardOwner {

    private static UINotepad instance;

    private File currentFile;

    //Components
    private Panel panel_content;
    private TextArea textArea_textContent;
    private MenuBar menuBar_main;
    private Menu menu_file;
    private Menu menu_edit;
    private Menu menu_help;
    private MenuItem menuItem_file_new;
    private MenuItem menuItem_file_open;
    private MenuItem menuItem_file_save;
    private MenuItem menuItem_file_saveAs;
    private MenuItem menuItem_file_exit;
    private MenuItem menuItem_edit_copy;
    private MenuItem menuItem_edit_cut;
    private MenuItem menuItem_edit_paste;
    private MenuItem menuItem_edit_selectAll;
    private MenuItem menuItem_help_info;


    public UINotepad(){
        super("Mirkos Schreibprogramm");

        this.setSize(640, 400);

        this.initComponent();
        this.initListeners();

        instance = this;
    }

    private void initComponent(){
        //init Components
        this.panel_content = new Panel(new BorderLayout());
        this.textArea_textContent = new TextArea();
        this.menuBar_main = new MenuBar();
        this.menu_file = new Menu("Datei");
        this.menu_edit = new Menu("Bearbeiten");
        this.menu_help = new Menu("Hilfe");
        this.menuItem_file_new = new MenuItem("Neu");
        this.menuItem_file_open = new MenuItem("Öffnen ...");
        this.menuItem_file_save = new MenuItem("Speichern");
        this.menuItem_file_saveAs = new MenuItem("Speicher unter ...");
        this.menuItem_file_exit = new MenuItem("Schließen");
        this.menuItem_edit_copy = new MenuItem("Kopieren");
        this.menuItem_edit_cut = new MenuItem("Ausschneiden");
        this.menuItem_edit_paste = new MenuItem("Einfügen");
        this.menuItem_edit_selectAll = new MenuItem("Alles auswählen");
        this.menuItem_help_info = new MenuItem("Info");

        // init Menu
        this.menuBar_main.add(this.menu_file);
        this.menuBar_main.add(this.menu_edit);
        this.menuBar_main.add(this.menu_help);

        //init menu Items
        this.menu_file.add(this.menuItem_file_new);
        this.menu_file.add(this.menuItem_file_open);
        this.menu_file.addSeparator();
        this.menu_file.add(this.menuItem_file_save);
        this.menu_file.add(this.menuItem_file_saveAs);
        this.menu_file.addSeparator();
        this.menu_file.add(this.menuItem_file_exit);

        this.menu_edit.add(this.menuItem_edit_copy);
        this.menu_edit.add(this.menuItem_edit_cut);
        this.menu_edit.add(this.menuItem_edit_paste);
        this.menu_edit.addSeparator();
        this.menu_edit.add(this.menuItem_edit_selectAll);

        this.menu_help.add(this.menuItem_help_info);

        //Add Component panel
        this.add(this.panel_content);
        this.setMenuBar(this.menuBar_main);

        //Add Components
        this.panel_content.add(this.textArea_textContent);
    }

    private void initListeners(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

        //Menu Item Listener
        this.menuItem_file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(instance);
                fd.setMode(FileDialog.LOAD);
                fd.setVisible(true);

                String s = fd.getDirectory() + fd.getFile();

                if (s != null){
                    try {
                        openFile(s);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }

                fd.setVisible(false);
            }
        });

        this.menuItem_file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentFile != null){
                    try {
                        saveFile(currentFile.getAbsolutePath());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    FileDialog fd = new FileDialog(instance);
                    fd.setMode(FileDialog.SAVE);
                    fd.setVisible(true);

                    String s = fd.getDirectory() + fd.getFile();
                    try {
                        saveFile(s);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } finally {
                        fd.setVisible(false);
                    }
                }
            }
        });

        this.menuItem_file_saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog fd = new FileDialog(instance);
                fd.setMode(FileDialog.SAVE);
                fd.setVisible(true);

                String s = fd.getDirectory() + fd.getFile();
                try {
                    saveFile(s);
                    currentFile = new File(s);

                    setTitle("Schreibprogramm - " + s);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } finally {
                    fd.setVisible(false);
                }
            }
        });

        this.menuItem_file_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentFile != null){
                    FileDialog fd = new FileDialog(instance);
                    fd.setMode(FileDialog.SAVE);
                    fd.setVisible(true);

                    String s = fd.getDirectory() + fd.getFile();
                    try {
                        saveFile(s);
                        currentFile = new File(s);

                        setTitle("Schreibprogramm - " + s);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    } finally {
                        fd.setVisible(false);
                    }
                }

                currentFile = null;
                textArea_textContent.setText(null);

                setTitle("Mirkos Schreibprogramm - Leeres Textdokument");
            }
        });

        this.menuItem_file_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });

        this.menuItem_edit_copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textArea_textContent.getText().isEmpty()){
                    StringSelection sl = new StringSelection(textArea_textContent.getText());
                    Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();

                    c.setContents(sl, instance);
                }
            }
        });

        this.menuItem_edit_paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                Transferable t = c.getContents(null);

                if(c.isDataFlavorAvailable(DataFlavor.stringFlavor) && t != null){
                    try {
                        String s = (String) t.getTransferData(DataFlavor.stringFlavor);
                        textArea_textContent.setText(textArea_textContent.getText() + s);
                    } catch (UnsupportedFlavorException unsupportedFlavorException) {
                        unsupportedFlavorException.printStackTrace();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            }
        });

        this.menuItem_edit_cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textArea_textContent.getText().isEmpty()){
                    StringSelection sl = new StringSelection(textArea_textContent.getText());
                    Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();

                    c.setContents(sl, instance);
                }
            }
        });

        this.menuItem_edit_selectAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int l = textArea_textContent.getText().length();
                textArea_textContent.setSelectionStart(0);
                textArea_textContent.setSelectionEnd(l);
            }
        });

        this.menuItem_help_info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UIAbout.create();
            }
        });
    }

    private void exit(){
        if(currentFile != null){
            FileDialog fd = new FileDialog(instance);
            fd.setMode(FileDialog.SAVE);
            fd.setVisible(true);

            String s = fd.getDirectory() + fd.getFile();
            try {
                saveFile(s);
                currentFile = new File(s);

                setTitle("Schreibprogramm - " + s);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            } finally {
                fd.setVisible(false);
            }
        }

        System.exit(0);
    }

    public static Frame showWindow(){
        UINotepad ui = new UINotepad();
        ui.setVisible(true);

        return ui;
    }

    public boolean openFile(String file) throws IOException {
        File f = new File(file);
        if(f.exists() && f.isFile()){
            BufferedReader br = new BufferedReader(new FileReader(f));
            StringBuilder sb = new StringBuilder();

            String line = null;
            while((line = br.readLine()) != null){
                sb.append(line);
            }

            br.close();

            this.currentFile = f;
            this.textArea_textContent.setText(sb.toString());

            this.setTitle("Mirkos Schreibprogramm - " + file);

            return true;
        } else {
            return false;
        }
    }

    public boolean saveFile(String file) throws IOException {
        File f = new File(file);

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(this.textArea_textContent.getText());

        bw.close();

        return true;
    }

    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {

    }
}

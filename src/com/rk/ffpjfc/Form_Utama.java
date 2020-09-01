package com.rk.ffpjfc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Form_Utama extends JFrame {

    JPanel panel;
    JButton btnOpenFile;

    public Form_Utama() {
        super("File Chooser Filter");
        Inisialisasi_Komponen();
    }

    public void Inisialisasi_Komponen() {
        panel = new JPanel();
        btnOpenFile = new JButton("Buka Image");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bukaJFileChooser();
            }
        });

        panel.add(btnOpenFile);

        getContentPane().add(panel, BorderLayout.CENTER);
        setPreferredSize(new Dimension(300, 100));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void bukaJFileChooser() {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new ImageFileFilter());
        fc.showOpenDialog(this);
    }
}

package UI;


import Files.FileWriterMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GeometryUI{
    FileWriterMain fileWriterMain = new FileWriterMain();
    JFrame frame = new JFrame("UI.Geometry");
    JFrame areaOfSquareFrame = new JFrame("Area of Square");
    JButton calculateAreaOfSquare = new JButton("Calculate");
    JButton areaOfSqrBtn = new JButton("Area of Square");
    JTextField enterLengthOfSquare = new JTextField("Enter Length");
    JButton areaOfTriBtn = new JButton("Area of Triangle");
    JButton areaOfRecBtn = new JButton("Area of Rectangle");

    public void mainUI() {
        frame.add(areaOfSqrBtn);
        frame.add(areaOfTriBtn);
        frame.add(areaOfRecBtn);
        frame.setSize(150, 200);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);
    }
    //Listener allows us to listen to an event
    public void sqr(){
        areaOfSqrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Calculate Area of Square");
                drawAreaOfSquareUI();
                JOptionPane.showMessageDialog(null,"Calculate Area of Square");

            }
        });

    }
    public void drawAreaOfSquareUI(){
        areaOfSquareFrame.add(enterLengthOfSquare);
        areaOfSquareFrame.add(calculateAreaOfSquare);
        areaOfSquareFrame.setLayout(new GridLayout(2,1));
        areaOfSquareFrame.setSize(150,200);
        areaOfSquareFrame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Geometry geo = new Geometry();
        calculateAreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float area = geo.areaOfSquare(Float.parseFloat(enterLengthOfSquare.getText()));

                // JOptionPane.showMessageDialog(null,area);
                fileWriterMain.writeData("Area of Square");
                JOptionPane.showMessageDialog(null,area);


            }

        });
    }

}
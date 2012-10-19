package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class GridLayoutDemo extends JFrame {
    public GridLayoutDemo(String name) {
        super(name);
        //setResizable(false);
    }
     
    public void addComponentsToPane(final Container pane) {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(new GridLayout(20, 20));
        //JPanel controls = new JPanel();
        //controls.setLayout(new GridLayout(2, 1));
         
        //compsToExperiment.setPreferredSize(new Dimension(500,500));
         
        //Add buttons to experiment with Grid Layout
        for (int i = 0; i < 400; i ++){
        	GuiTile thisBtn = new GuiTile(0);
        	thisBtn.setPreferredSize(new Dimension(30, 30));
        	compsToExperiment.add(thisBtn);
        }
         
        pane.add(compsToExperiment, BorderLayout.WEST);
        //pane.add(new JSeparator(), BorderLayout.CENTER);
        //pane.add(controls, BorderLayout.EAST);
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        GridLayoutDemo frame = new GridLayoutDemo("GridLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
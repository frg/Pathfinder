package src;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class GuiMain extends JFrame {
	ArrayList<GuiTile> guiNodes = new ArrayList<GuiTile>();
	
	 public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
	
    public GuiMain(String name) {
        super(name);
        setResizable(false);
    }
     
    public void addComponentsToPane(final Container pane) {
        final JPanel mapPanel = new JPanel();
        mapPanel.setLayout(new GridLayout(20, 20));
        //JPanel controls = new JPanel();
        //controls.setLayout(new GridLayout(2, 1));
         
        mapPanel.setPreferredSize(new Dimension(400,400));
         
        Dimension btnDim = new Dimension(10, 10);
        //Add buttons to experiment with Grid Layout
        for (int y = 0; y < 20; y++){
        	for (int x = 0; x < 20; x++) {
        		GuiTile thisBtn = new GuiTile(x, y, 0);
        		//thisBtn.setPreferredSize(btnDim);

        		//Add action listener to button
            	thisBtn.addActionListener(new ActionListener() {
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					GuiTile tempBtn = (GuiTile) e.getSource();
    					
    					if (tempBtn.isSelected()){
    						tempBtn.setG(1);
    						guiNodes.add(new GuiTile(tempBtn.getCol(), tempBtn.getRow(), Double.MAX_VALUE));
    					} else {
    						tempBtn.setG(0);
    					}
    					
    					System.out.println(tempBtn.toString() + " g: " + tempBtn.getG());
    				}
    			});
            	
            	mapPanel.add(thisBtn);
        	}
        }
         
        pane.add(mapPanel, BorderLayout.WEST);
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
        GuiMain frame = new GuiMain("GridLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}

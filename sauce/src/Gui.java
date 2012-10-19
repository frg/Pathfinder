package src;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

class Gui extends JFrame {
	public Gui() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("Pathfinder [frg]");
		setSize(700, 500); // default size is 0,0
		setLocationRelativeTo(null);
		
		Container window = getContentPane();
		JPanel mapPane = new JPanel();
		mapPane.setLayout(new GridLayout(0,2));
		window.add(mapPane);
		
		JButton btn = new JButton("Button");
		JButton btn1 = new JButton("Button");
		JButton btn2 = new JButton("Button");
		JButton btn3 = new JButton("Button");
		mapPane.add(btn);
		mapPane.add(btn1);
		mapPane.add(btn2);
		mapPane.add(btn3);
	}
}

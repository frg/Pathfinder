package src.v2;

import javax.swing.JToggleButton;

public class GuiTile extends JToggleButton{
	private double g;
	private int col;
	private int row;
	
	public GuiTile(int col, int row, double g){
		this.col = col;
		this.row = row;
		this.g = g;
	}
	
	public String toString(){
		return "x: " + col + " y: " + row;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
}

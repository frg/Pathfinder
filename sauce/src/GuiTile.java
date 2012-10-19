package src;

import javax.swing.JToggleButton;

public class GuiTile extends JToggleButton{
	private double g;
	private int row;
	private int col;
	
	public GuiTile(double g){
		this.g = g;
	}
	
	public String toString(){
		return "x: " + row + " y: " + col;
	}
	
	public void setRowCol(int row, int col){
		this.row = row;
		this.col = col;
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

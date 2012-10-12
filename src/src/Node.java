package src;

public class Node {
	private int x;
	private int y;
	private boolean isWall;
	private double moveScore;
	
	public Node(){
		this.x = Integer.MAX_VALUE;
		this.y = Integer.MAX_VALUE;
		isWall = false;
		moveScore = 0.0;
	}
	
	public Node(int x, int y){
		this.x = x;
		this.y = y;
		isWall = false;
		moveScore = 0.0;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isWall() {
		return isWall;
	}
	public void setWall(boolean isWall) {
		this.isWall = isWall;
	}
	
	public double getMoveScore() {
		return moveScore;
	}
	
	public void setMoveScore(double moveScore) {
		this.moveScore = moveScore;
	}
}

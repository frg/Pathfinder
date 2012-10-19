package src;

public class MapNode {
    private int x;
	private int y;
	private double g;

    public MapNode(int x, int y, double g){
        this.x = x;
        this.y = y;
        this.g = g;
    }
    
    public MapNode(Node node){
    	x = node.getX();
    	y = node.getY();
    }
    
    // Compare by x and y
 	public boolean compareTo(MapNode node) {
 		return (node.x == x && node.y == y);
 	}

 	@Override
 	public String toString() {
		return "x:" + x + " y:" + y;
	}
	
	public void printCords(){
		System.out.println("x:" + x + " y:" + y);
	}
    
	public double getG(){
		return g;
	}
	
    public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
    
    public boolean isWall() {
        return g == Double.MAX_VALUE;
    }
}

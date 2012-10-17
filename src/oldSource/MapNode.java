package oldSource;

public class MapNode {
    private int x;
	private int y;
	private boolean wall;

    public MapNode(int x, int y, boolean wall){
        this.x = x;
        this.y = y;
        this.wall = wall;
    }
    
    public MapNode(Node node){
    	x = node.getX();
    	y = node.getY();
    	wall = node.isWall();
    }
    
    public MapNode(){
    }
    
    // Compare by x and y
 	public boolean compareTo(MapNode node) {
 		return (node.x == x && node.y == y);
 	}

 	@Override
 	public String toString() {
 		return "x:" + x + " y:" + y + " wall: " + wall;
 	}
    
    public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
    
    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }
}

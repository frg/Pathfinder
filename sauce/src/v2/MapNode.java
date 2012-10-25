package src.v2;

public class MapNode implements Comparable<MapNode>{
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
    
    public MapNode(GuiTile node){
    	x = node.getRow();
    	y = node.getCol();
    	g = node.getG();
    }
    
    // Compare by x and y 	
  	@Override
 	public int compareTo(MapNode mapNode) {
 		// TODO Auto-generated method stub
  		if (mapNode.getX() == this.getX() && mapNode.getY() == this.getY()) {
  			return 0;
  		}
  		
  		return -1;
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

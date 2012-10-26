package src;

public class Node extends HeuristicCalculator{
    private Node parent;
    private int x;
	private int y;
    //F = G(dist from start) + H(dist from end);
    private double f;

    public Node(int x, int y, Node parent, double g, double h){
        this.x = x;
        this.y = y;
        this.parent = parent;
        setF(g, h);
    }
    
    public Node(int x, int y, double g, double h){
        this.x = x;
        this.y = y;
        setF(g, h);
    }
    
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Node(MapNode mapNode){
    	this.x = mapNode.getX();
    	this.y = mapNode.getY();
    }
    
    public Node(){
    }
    
    // Compare by x and y 	
	public boolean equals(Node node) {
 		return (node.getX() == this.getX() && node.getY() == this.getY());
	}

 	@Override
 	public String toString() {
 		return "x:" + x + " y:" + y;
 	}
 	
 	public void printCords(){
 		System.out.println("x:" + x + " y:" + y);
 	}

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
    
    public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
    
    public double getF(){
    	return f;
    }
    
    public void setF(double g, double h){
    	this.f = g + h;
    }
}
    
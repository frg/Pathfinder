package oldSource;

public class Node {
    private Node prev;
    private Node next;
    private int x;
	private int y;
    //F = G(dist from start) + H(dist from end);
    private double f;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Node(MapNode mapNode){
    	x = mapNode.getX();
    	y = mapNode.getY();
    }
    
    public Node(){
    }
    
    // Compare by x and y
 	public boolean compareTo(Node node) {
 		return (node.x == x && node.y == y);
 	}

 	@Override
 	public String toString() {
 		return "x:" + x + " y:" + y;
 	}
    
    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
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
    
package oldSource;

public class Node {
    private Node prev;
    private Node next;
    //F = G(dist from start) + H(dist from end);
    private double f;

    public Node(Node prev, Node next){
        setPrev(prev);
        setNext(next);
    }
    
    public Node(){
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
    
    public boolean isWall() {
        return f >= Double.MAX_VALUE;
    }

    public void setWall() {
        this.f = Double.MAX_VALUE;
    }
    
    public double getF(){
    	return f;
    }
    
    public void setF(double g, double h){
    	this.f = g + h;
    }
}
    
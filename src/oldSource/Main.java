package oldSource;

public class Main {

    public static void main(String[] args) {        
        //Define start and finish
        int tx = 6;	//Columns
        int ty = 8;	//Rows
        int sx = 1;	
        int sy = 0;
        
        Node start = new Node (6, 8, Double.MAX_VALUE, Double.MAX_VALUE);
        Node target = new Node (1, 0, 0, 0);
        
        Pathfinder pathF = new Pathfinder();
         
        /*Node n1 = new Node("Jean", false);
        Node n2 = new Node("William",n1,null, false);
        n1.setNext(n2);
        Node n3 = new Node("Anthony",n2, null, false);
        n2.setNext(n3);

        Node start = n1;*/

        //Node[][] map = new Node[5][5];

    }
}

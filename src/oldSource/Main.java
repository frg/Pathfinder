package oldSource;

public class Main {

    public static void main(String[] args) {        
        //Define start and finish
        int tx = 6;	//Columns
        int ty = 8;	//Rows
        int sx = 1;	
        int sy = 0;
        
        Pathfinder pathF = new Pathfinder();
        pathF.findAdjacent(new Node(0,0));
        pathF.findAdjacent(new Node(0,9));
        pathF.findAdjacent(new Node(9,0));
        pathF.findAdjacent(new Node(9,9));
         
        /*Node n1 = new Node("Jean", false);
        Node n2 = new Node("William",n1,null, false);
        n1.setNext(n2);
        Node n3 = new Node("Anthony",n2, null, false);
        n2.setNext(n3);

        Node start = n1;*/

        //Node[][] map = new Node[5][5];

    }
}

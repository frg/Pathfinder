package oldSource;

public class Main {

    public static void main(String[] args) {
        Map map = new Map();
        Node current = new Node();
        
        //Initialize MAP with UNBLOCKED nodes
        for (int c=0; c<=map.ROWS-1; c++){
            for (int r=0; r<=map.COLS-1; r++){
                map.map[r][c]=new Node();
            }
        }
        
        //Define start and finish
        int tx = 9;	//Columns
        int ty = 0;	//Rows
        int sx = 0;	
        int sy = 9;
         
        /*Node n1 = new Node("Jean", false);
        Node n2 = new Node("William",n1,null, false);
        n1.setNext(n2);
        Node n3 = new Node("Anthony",n2, null, false);
        n2.setNext(n3);

        Node start = n1;*/

        //Node[][] map = new Node[5][5];

    }
}

package src;

public class Main {

    public static void main(String[] args) {        
        //Define start and finish        
        Node start = new Node (1, 0, Double.MAX_VALUE, Double.MAX_VALUE);
        Node target = new Node (6, 9, 0, 0);
        
        StopWatch watch = new StopWatch();
        watch.start();
        Pathfinder pathF = new Pathfinder(start, target);
        watch.stop();
        System.out.println("Time taken to find path: " + watch.getElapsedTime() + "ms");
         
        /*Node n1 = new Node("Jean", false);
        Node n2 = new Node("William",n1,null, false);
        n1.setNext(n2);
        Node n3 = new Node("Anthony",n2, null, false);
        n2.setNext(n3);

        Node start = n1;*/

        //Node[][] map = new Node[5][5];

    }
}

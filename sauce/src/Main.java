package src;

public class Main {

    public static void main(String[] args) {        
        //Define start and finish        
        Node start = new Node (1, 0, Double.MAX_VALUE, Double.MAX_VALUE);
        Node target = new Node (6, 9, 0, 0);
        
        StopWatch watch = new StopWatch();
        watch.start();
        new Pathfinder(start, target);
        watch.stop();
        System.out.println("Time taken to find path: " + watch.getElapsedTime() + "ms");
    }
}

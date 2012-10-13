package oldSource;

//Include Manhattan distance, Euclidean distance, Diagonal shortcut
import java.util.*;
public class HeuristicCalculator{

    /*public double diagonalShorcut(int x, int y, int tx, int ty){
        int x1 = Math.abs(x-tx);
        int y1 = Math.abs(y-ty);
        double h;
        
        if(x1>y1)
            h = 14*y1+10*(x1-y1);
        else
            h = 14*x1+10*(y1-x1);
        return h;
    }
    
    //Best Heuristic
    //Used with diagonals enabled
    public double euclideanDistance(int x, int y, int tx, int ty){
        int x1 = Math.abs(x-tx);
        int y1 = Math.abs(y-ty);
        
        //Done in Math class
        double h = Math.pow((Math.pow(x1,2) + Math.pow(y1,2)),0.5);
        return h;
    }*/
    
    public double manhattanDistance(int x, int y, int tx, int ty){
        double h = 10*(Math.abs(x-tx)+Math.abs(y-ty));
        return h;
    }
}

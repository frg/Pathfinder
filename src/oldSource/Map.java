package oldSource;

public class Map{
	int mapX = 10;
	int mapY = 10;
   
	//Map
    byte [][] map = new byte[][]{
    		//       0 1 2 3 4 5 6 7 8 9
            /* 0 */ {1,0,0,0,0,1,1,1,1,1},
            /* 1 */ {1,1,1,1,0,0,1,0,0,1},
            /* 2 */ {1,0,1,0,0,0,1,1,0,1},
            /* 3 */ {1,0,0,0,1,0,0,0,0,0},
            /* 4 */ {1,1,1,0,1,0,1,0,0,1},
            /* 5 */ {1,0,0,0,0,0,0,0,1,1},
            /* 6 */ {1,0,1,1,0,1,1,0,1,0},
            /* 7 */ {1,0,1,0,0,0,0,1,0,0},
            /* 8 */ {1,0,1,0,1,1,0,0,0,1},
            /* 9 */ {1,1,1,0,1,1,0,1,1,1}
    };
    
    MapNode[][] nodeMap = new MapNode[10][10];
    
    public Map(){
    	convertMap();
    }
    
    public void convertMap(){
    	for (int x = 0; x < 10; x++){
    		for (int y = 0; y < 10; y++){
    			if (map[y][x] == 1){
    				nodeMap[y][x] = new MapNode(x, y, true, Double.MAX_VALUE);
    			} else {
    				nodeMap[y][x] = new MapNode(x, y, false, map[y][x]);
    			}
    			//nodeMap[y][x].printCords();
    		}
    	}
    }
	
	/*int ROWS = 10;
	int COLS = 10;
	Node[][] map = new Node [ROWS][COLS];*/
}

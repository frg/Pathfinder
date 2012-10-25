package src.v2;

import java.util.ArrayList;

public class Map{
	int mapX = 10;
	int mapY = 10;
   
	//Map
    int [][] map = new int[][]{
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
    
    MapNode[][] nodeMap = new MapNode[mapY][mapX];

    public Map(int mapX, int mapY, ArrayList<GuiTile> tileNodes){
    	convertGuiTiles(tileNodes);
    }
    
    public Map(){
    	convertMap();
    }
    
    public void convertMap(){
    	for (int x = 0; x < mapX; x++){
    		for (int y = 0; y < mapY; y++){
    			if (map[y][x] == 1){
    				nodeMap[y][x] = new MapNode(x, y, Double.MAX_VALUE);
    			} else {
    				nodeMap[y][x] = new MapNode(x, y, map[y][x]);
    			}
    			//nodeMap[y][x].printCords();
    		}
    	}
    }
    
    public void convertGuiTiles(ArrayList<GuiTile> tileNodes){
    	//Fill map with walkable nodes
    	for (int x = 0; x < mapX; x++){
    		for (int y = 0; y < mapY; y++){
    			nodeMap[y][x] = new MapNode(x, y, 0);
    			//nodeMap[y][x].printCords();
    		}
    	}
    	
    	//Fill map with specified walls
    	for (int i = 0; i < tileNodes.size(); i++) {
    		nodeMap[tileNodes.get(i).getRow()][tileNodes.get(i).getCol()] = new MapNode(tileNodes.get(i).getCol(), tileNodes.get(i).getRow(), Double.MAX_VALUE);
    	}
    }
	
	/*int ROWS = 10;
	int COLS = 10;
	Node[][] map = new Node [ROWS][COLS];*/
}

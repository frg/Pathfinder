package src;

public class Pathfinder {
	Node map[][] = new Node[10][10];
	
	public void drawMap(){
		map[3][2].setWall(true);
		for(int i = 0; i < 10; i++){
			for(int k = 0; k < 10; k++) {
				if (map[i][k].isWall()){
					System.out.print("  ");
				} else {
					System.out.print("[]");
				}
				
			}
			System.out.println();
		}
	}
}

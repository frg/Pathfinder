package oldSource;

public class Pathfinder {
	Map map = new Map();

	//Assumption that provided node is not wall
	public Node[] findAdjacent(Node current){
		Node nodeList[] = new Node[4];
		
		if (current.getX()-1 > 0 && !map.nodeMap[current.getY()][current.getX()-1].isWall()){
			nodeList[0] = new Node(current.getX()-1, current.getY());
		}
		if (current.getX()+1 < map.mapX && !current.isWall()){
			nodeList[1] = new Node(current.getX()+1, current.getY());
		}
		if (current.getY()-1 > 0 && !current.isWall()){
			nodeList[2] = new Node(current.getX(), current.getY()-1);
		}
		if (current.getY()+1 < map.mapY && !current.isWall()){
			nodeList[3] = new Node(current.getX(), current.getY()+1);
		}
		
		//nodeList[0].toString();
		//nodeList[1].toString();
		//nodeList[2].toString();
		//nodeList[3].toString();
		
		return nodeList;
	}
}

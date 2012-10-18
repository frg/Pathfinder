package oldSource;

import java.util.ArrayList;
import java.util.Collections;

public class Pathfinder extends HeuristicCalculator{
	Map map = new Map();
	private Node target;
	
	ArrayList<Node> openList = new ArrayList<Node>();
	ArrayList<Node> closedList = new ArrayList<Node>();
	
	public Pathfinder(Node start, Node target){
		this.target = target;
		int currentElementNum = 0;
		openList.add(start);
		//saves the location of the item to be searched
		currentElementNum = openList.size();
		
		//adds adjacent nodes to open list
		Collections.copy(openList, findAdjacent(start));
		//remove searched item from open list
		openList.remove(0);
		//remove null elements
		openList.removeAll(Collections.singleton(null));
		
		
	}

	//Assumption that provided node is not wall
	public ArrayList<Node> findAdjacent(Node current){
		//Node nodeList[] = new Node[4];
		ArrayList<Node> nodeList = new ArrayList<Node>();
		Double h = manhattanDistance(current, target);
		
		if (current.getX()-1 > 0 && !map.nodeMap[current.getY()][current.getX()-1].isWall()){
			nodeList.add(new Node(current.getX()-1, current.getY(), current, 
					//values required to work out h
					map.nodeMap[current.getY()][current.getX()-1].getG(), h));
		}
		if (current.getX()+1 < map.mapX && !map.nodeMap[current.getY()][current.getX()+1].isWall()){
			nodeList.add(new Node(current.getX()+1, current.getY(), current, 
					//values required to work out h
					map.nodeMap[current.getY()][current.getX()+1].getG(), h));
		}
		if (current.getY()-1 > 0 && !map.nodeMap[current.getY()-1][current.getX()].isWall()){
			nodeList.add(new Node(current.getX(), current.getY()-1, current, 
					//values required to work out h
					map.nodeMap[current.getY()-1][current.getX()].getG(), h));
		}
		if (current.getY()+1 < map.mapY && !map.nodeMap[current.getY()+1][current.getX()].isWall()){
			nodeList.add(new Node(current.getX(), current.getY()+1, current, 
					//values required to work out h
					map.nodeMap[current.getY()+1][current.getX()].getG(), h));
		}
		nodeList.trimToSize();
		
		System.out.println("==== Adjacent Nodes ==== " + current.toString());
		for(int i = 0; i < nodeList.size(); i++){
			nodeList.get(i).printCords();
		}
		
		return nodeList;
	}
}

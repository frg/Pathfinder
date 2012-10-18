package src;

import java.util.ArrayList;
import java.util.Collections;

public class Pathfinder extends HeuristicCalculator{
	Map map = new Map();
	private Node target;
	
	ArrayList<Node> openList = new ArrayList<Node>();
	ArrayList<Node> closedList = new ArrayList<Node>();
	
	public Pathfinder(Node start, Node target){
		this.target = target;
		
		Node current = router(start);
		//do until target is found
		while (!current.compareTo(target)){
			current = router(current);
		}
	}
	
	public Node router(Node current){
		int currentElementNum = 0;
		//saves the location of the item to be searched
		currentElementNum = openList.size();
		openList.add(current);
		
		//adds adjacent nodes to open list
		openList.addAll(findAdjacent(current));
		//adds current element to closed list
		closedList.add(openList.get(currentElementNum));
		//remove searched item from open list
		openList.remove(currentElementNum);
		
		//find node with lowest f in open list
		double lowF = Double.MAX_VALUE;
		int element = Integer.MAX_VALUE;
		for(int i = 0; i < openList.size(); i++){
			if (!closedContains(openList.get(i)) && openList.get(i).getF() < lowF){
				lowF = openList.get(i).getF();
				element = i;
			}
		}
		
		System.out.println("current: " + openList.get(element).toString());
		return openList.get(element);
	}

	//Assumption that provided node is not wall
	public ArrayList<Node> findAdjacent(Node current){
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
	
	public boolean closedContains(Node thisNode){
		for (int i = 0; i < closedList.size(); i++){
			if (closedList.get(i).compareTo(thisNode)) {
				//System.out.println(thisNode.toString() + " is in closed list!");
				return true;
			}
		}
		return false;
	}
	
	public boolean openContains(Node thisNode){
		for (int i = 0; i < openList.size(); i++){
			if (openList.get(i).compareTo(thisNode)) {
				//System.out.println(thisNode.toString() + " is in open list!");
				return true;
			}
		}
		return false;
	}
}

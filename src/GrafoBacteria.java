import java.util.ArrayList;

class Graph{
	ArrayList<ArrayList<Integer>> graph;
	int V;
	
	Graph(int nodes){
		V=nodes;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<V; i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	void addEdge(int v , int u) {
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
	void printGraph() {
		for(int i=0; i<V;i++) {
			System.out.print( i);
			for(int x : graph.get(i))System.out.print(" ->" + x);
			System.out.println();
		}
	}
}

public class GrafoBacteria {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(11);
		
		g.addEdge(0, 1);
		g.addEdge(0, 10);
		g.addEdge(0, 9);
		
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(1, 6);
		g.addEdge(1, 7);
		g.addEdge(1, 8);
		g.addEdge(1, 9);
		g.addEdge(1, 10);
		
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		g.addEdge(2, 6);
		g.addEdge(2, 7);
		g.addEdge(2, 8);
		g.addEdge(2, 9);
		
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(3, 6);
		g.addEdge(3, 7);
		g.addEdge(3, 8);
		g.addEdge(3, 9);
		
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(4, 7);
		g.addEdge(4, 8);
		
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(5, 8);
		g.addEdge(5, 9);
		
		g.addEdge(6, 7);
		g.addEdge(6, 8);
		g.addEdge(6, 9);
		
		g.addEdge(7, 8);
		g.addEdge(7, 9);
		
		g.addEdge(8, 9);
		
		g.addEdge(9, 10);
		
		g.printGraph();
	}

}

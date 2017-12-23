package project02;

public class MSTWApp {


	   public static void main(String[] args)
	      {
		   long startTime = System.nanoTime();
		      Graph theGraph = new Graph();
		      theGraph.addVertex('A');    // 0  (start for mst)
		      theGraph.addVertex('B');    // 1
		      theGraph.addVertex('C');    // 2
		      theGraph.addVertex('D');    // 3
		      theGraph.addVertex('E');    // 4
		      theGraph.addVertex('F');    // 5

		      theGraph.addEdge(0, 1, 6);  // AB  6
		      theGraph.addEdge(0, 3, 4);  // AD  4
		      theGraph.addEdge(1, 2, 10); // BC 10
		      theGraph.addEdge(1, 3, 7);  // BD  7
		      theGraph.addEdge(1, 4, 7);  // BE  7
		      theGraph.addEdge(2, 3, 8);  // CD  8
		      theGraph.addEdge(2, 4, 5);  // CE  5
		      theGraph.addEdge(2, 5, 6);  // CF  6
		      theGraph.addEdge(3, 4, 12); // DE 12
		      theGraph.addEdge(4, 5, 7);  // EF  7
		      System.out.println("Using Prim's Algorithm");		     
		      System.out.print("Minimum spanning tree: " );
		      theGraph.mstw();            // minimum spanning tree
		      System.out.println();
		      long endTime   = System.nanoTime();
		      long totalTime = endTime - startTime;
		      System.out.println(totalTime + " Nano seconds");  
////////////////////////////////////////////////////////////////////////////////////////
		  
		 
		  KruskalAlgorithm theGraph2 = new KruskalAlgorithm(6);
		  long startTime1 = System.nanoTime();
	      theGraph2.addVertex('A');    // 0  (start for mst)
	      theGraph2.addVertex('B');    // 1
	      theGraph2.addVertex('C');    // 2
	      theGraph2.addVertex('D');    // 3
	      theGraph2.addVertex('E');    // 4
	      theGraph2.addVertex('F');    // 5

	      theGraph2.addEdge(0, 1, 6);  // AB  6
	      theGraph2.addEdge(0, 3, 4);  // AD  4
	      theGraph2.addEdge(1, 2, 10); // BC 10
	      theGraph2.addEdge(1, 3, 7);  // BD  7
	      theGraph2.addEdge(1, 4, 7);  // BE  7
	      theGraph2.addEdge(2, 3, 8);  // CD  8
	      theGraph2.addEdge(2, 4, 5);  // CE  5
	      theGraph2.addEdge(2, 5, 6);  // CF  6
	      theGraph2.addEdge(3, 4, 12); // DE 12
	      theGraph2.addEdge(4, 5, 7);  // EF  7
	     
	      System.out.println();
	      System.out.println("Using Kruskal's Algorithm");     
	      System.out.print("Minimum spanning tree: " + "\n");
	      
	      theGraph2.applyKrushkalAlgo();            // minimum spanning tree
	      System.out.println(); 
	      long endTime1   = System.nanoTime();
	      long totalTime2 = endTime1 - startTime1;
	      System.out.println(totalTime2 + " Nano seconds ");
	      }  // end main()
	   }  // end class MSTWApp
	////////////////////////////////////////////////////////////////


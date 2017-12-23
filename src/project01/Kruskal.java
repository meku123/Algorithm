package project01;

import java.util.Scanner;

public class Kruskal {
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert the graph chart ");
		int[][] Matrix = new int[5][5];
		int[] parent = new int [5];
		
		int min; 
		int u = 0; 
		int v = 0; 
		int noOfEdges = 1;
		int total = 0;
		
		for(int i = 0; i < 5; i++){
			parent[i] = 0;
			
			for(int j = 0; j < 5; j++){
				Matrix[i][j] = scan.nextInt();
				if(Matrix[i][j] == 0){
					Matrix[i][j] = 999;
					
				}
			}
		}
		while(noOfEdges < 5){
			min = 999;
			for(int i = 0; i < 5; i++){
				for(int j = 0; j <5; j++){
					if(Matrix[i][j] < min){
						min = Matrix[i][j];
						u = i;
						v = j;
					}
				}
			}
			while(parent[u] != 0){
				u = parent[u];
			}
			while(parent[v] != 0){
				v = parent[v];
			}
			if(v != u){
				noOfEdges ++;
				System.out.println("Edge found: " + u + " -> " + v + "Minimun: " + min);
				total += min;
				parent[v] = u;
				
			}
			Matrix[u][v] = Matrix[v][u] = 999;
		}
		System.out.println("The weight of the min spanning tree is " + total);
	}

}

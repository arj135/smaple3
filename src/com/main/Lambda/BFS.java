package com.main.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		adj.add(new ArrayList<>(Arrays.asList(2,3,1)));
		adj.add(new ArrayList<>(Arrays.asList(0)));
		adj.add(new ArrayList<>(Arrays.asList(0,4)));
		adj.add(new ArrayList<>(Arrays.asList(0)));
		adj.add(new ArrayList<>(Arrays.asList(2)));
		int source =4;
		ArrayList<Integer> result= bfsOfGraph(adj, source);
		System.out.println("\nresult");
		result.stream().forEach(x->System.out.println(x));

	}
	
	public static  ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj, int source){
		ArrayList<Integer> result = new ArrayList<>();
		int v =adj.size();
		boolean [] visited = new boolean[v];
		System.out.println(v);
		Queue<Integer> q= new LinkedList<>();
		for(boolean i: visited) {
			System.out.println(i);
		}
		visited[source]=true;
		q.add(source);
		while(!q.isEmpty()) {
			int current =q.poll();
			result.add(current);
			
			for(int x: adj.get(current)) {
				if(!visited[x]) {
					visited[x]= true;
					q.add(x);
				}
			}
			
		}
		
		
		
		return result;
	}
	

}

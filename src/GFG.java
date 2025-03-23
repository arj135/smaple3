// Java program to find if there is a path 
// between two vertices in a directed graph
// using Dynamic Programming
import java.util.*;

class GFG{
	
static final int X = 6;
static final int Z = 2;

// Function to find if there is a
// path between two vertices in a
// directed graph
static boolean existPath(int V, int edges[][],
						int u, int v)
{
	
	// mat matrix
	boolean [][]mat = new boolean[V][V];

	// set mat[i][j]=true if there is
	// edge between i to j
	for (int i = 0; i < X; i++)
		mat[edges[i][0]][edges[i][1]] = true;

	// Check for all intermediate vertex
	for(int k = 0; k < V; k++) 
	{
		for(int i = 0; i < V; i++) 
		{
			for(int j = 0; j < V; j++)
			{
				mat[i][j] = mat[i][j] || 
							mat[i][k] &&
							mat[k][j];
			}
		}
	}

	// If vertex is invalid
	if (u >= V || v >= V)
	{
		return false;
	}

	// If there is a path
	if (mat[u][v])
		return true;
	return false;
}

// Driver code
public static void main(String[] args)
{
	int V = 4;
	int edges[][] = { { 0, 2 }, { 0, 1 },
					{ 1, 2 }, { 2, 3 },
					{ 2, 0 }, { 3, 3 } };
	int u = 3, v = 3;

	if (existPath(V, edges, u, v))
		System.out.print("Yes\n");
	else
		System.out.print("No\n");
}
}

// This code is contributed by Princi Singh

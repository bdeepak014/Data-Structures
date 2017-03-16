class BFS
{
	boolean[] marked;
	int[] edgeTo;
	BFS(Graph_creation G ,int s)
	{
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		bfs(G,s);
	}
	void bfs(Graph_creation G , int s)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		marked[s] = true;
		while(!q.isEmpty())
		{
			int x = q.poll();
			for(int k : G.adj[x])
			{
				if(!marked[k])
				{
					q.add(k);
					marked[k] = true;
					edgeTo[k] = x; 
				}
			}
		}
		
	
		
	}
}

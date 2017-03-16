class DFS
{
	private boolean[] marked;
	private Integer[] edgeTo;
	public DFS(Graph_creation G,int s)
	{
		marked = new boolean[G.V()];
		edgeTo = new Integer[G.V()];
		for(int i=0;i<G.V();i++)
		{
			edgeTo[i] = Integer.MAX_VALUE;
		}
		edgeTo[s] = s;
		dfs(G,s);
	}
	void dfs(Graph_creation G,int s)
	{
		marked[s] = true;
	//	System.out.println(s);
		for(Integer k : G.adj(s))
		{
			if(!marked[k])
			{
				edgeTo[k] = s;
				dfs(G,k);
			}
		}
	}
	void print(Graph_creation G)
	{
		for(int i=0;i<G.V();i++)
		{
			//if(marked[i])
				System.out.println(edgeTo[i] + "y");
		}
	}
}
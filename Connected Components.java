class CC{
	private boolean[] marked;
	private int[] cc;
	private int count;
	public CC(Graph_creation G)
	{
		marked = new boolean[G.V()];
		cc = new int[G.V()];
		for(int i = 0;i < G.V(); i++)
		{
			if(!marked[i])
			{
				count++;
				dfs(G,i);
				//count++;
			}
			
		}	
	}
	void dfs(Graph_creation G , int s)
	{
		marked[s] = true;
		cc[s] = count;
		for(Integer k : G.adj[s])
		{
			if(!marked[k])
			dfs(G,k);			
		}
		
	}
	int[] getCc()
	{
		return cc;
	}
}

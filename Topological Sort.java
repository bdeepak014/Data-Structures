class Topological_sort
{
	boolean[] marked;
	Stack<Integer> s;
	Topological_sort(Graph_creation G)
	{
		marked = new boolean[G.V()];
		s = new Stack<Integer>();
		for(int i=0;i<G.V();i++)
		{
			if(!marked[i])
			dfs(G,i);
		}
	}
			void dfs(Graph_creation G,int k)
			{
				marked[k] = true;
				for(Integer o : G.adj[k])
				{
					if(!marked[o])
					{
					
					//	System.out.println(o);
						dfs(G,o);
					}
				}
				s.push(k);
				System.out.println(k);
				
			}
			void print()
			{
				while(!s.isEmpty())
				{
					int x = s.pop();
					System.out.println(x + "c");
				}
			}
	
	
}

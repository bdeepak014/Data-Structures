void levelorder()
	{
		int h = height();
		for(int i = 1; i <= h; i++)
		{
			printlevelorder1(root,i);
		}
	}
	void printlevelorder1(Node root,int l)
	{
		if(root == null)
			return;
		if(l == 1)
			System.out.println(root.key);
		else if(l > 1)
		{
			printlevelorder1(root.left,l-1);
			printlevelorder1(root.right,l-1);
		}
	}
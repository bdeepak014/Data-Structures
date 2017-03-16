int min(Node root)
	{
		if(root.left == null)
		return root.key;
		return min(root.left);
		
	}
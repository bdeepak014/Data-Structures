	void delmin()
	{
		root = delmin1(root);
	}
	Node delmin1(Node root)
	{
		if(root.left == null)
		{
			return root.right;
		}
		root.left = delmin1(root.left);
		return root;
	}

	void delmax()
	{
		root = delmax1(root);
	}
	Node delmax1(Node root)
	{
		if(root.right == null)
		{
			return root.left;
		}
			root.right = delmax1(root.right);
			return root;
	}
	
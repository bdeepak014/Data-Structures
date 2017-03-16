void preorder(Node root)
	{
		if(root == null)
			return;
		System.out.println(root.key);
		preorder(root.left);
		preorder(root.right);
	}
void delete(int n)
	{
		root = delete1(root,n);
	}
	Node delete1(Node root,int n)
	{
		if(root == null)
		{
			return root;
		}
		else if(root.key > n)
		{
			root.left = delete1(root.left,n);
		}
		else if(root.key < n)
		{
			root.right = delete1(root.right,n);
		}
		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
			{
				root.key = min(root.right);
				root.right = delmin1(root.right);
			}
		}
		return root;
	}

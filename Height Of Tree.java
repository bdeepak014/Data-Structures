int height(){
		int height = height1(root);
		return height;
	}
int height1(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		int l = 1 + height1(root.left);
		int r = 1 + height1(root.right);
		if( l > r)
			return l;
		else 
			return r;
	
	}
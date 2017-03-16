void insert(int key)
	{
		root = insert1(root,key);
	}
	Node insert1(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		else if(root.key > key){
			root.left = insert1(root.left,key);
		}
		else if(root.key < key){
			root.right = insert1(root.right,key);
		}
		return root;
	}
class Tree
{
	/* Should return true if trees with roots as root1 and 
   root2 are identical else false */
        boolean isIdentical(Node root1, Node root2)
	{
		//Your code here
		if(root1==null &&root2==null)
		return true;
		if(root1!=null && root2!=null)
		{
		    return((root1.data==root2.data)&&(isIdentical(root1.left,root2.left))&&(isIdentical(root1.right,root2.right)));
		}
		return false;
	}
	
}

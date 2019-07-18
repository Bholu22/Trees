class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
     int height(Node node)  
    { 
        /* base case tree is empty */
        if (node == null) 
            return 0; 
   
        /* If tree is not empty then height = 1 + max of left 
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right)); 
    } 
    boolean isBalanced(Node node)
    {
	// Your code here
	
    if(node==null)
    return true;
    int lh;
    int rh;
    lh = height(node.left); 
        rh = height(node.right); 
   
        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left) 
                && isBalanced(node.right))  
            return true; 
   
        /* If we reach here then tree is not height-balanced */
        return false; 
}
}
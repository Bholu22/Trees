class Level_order_traversal
{
    //You are required to complete this method
   static Queue <Node> q=new LinkedList<Node>();
    static void levelOrder(Node node) 
    {
        // Your code here
        q.add(node);
        while(!q.isEmpty()){
            Node n=q.remove();
            System.out.print(n.data+" ");
            if(n.left!=null)
            {
                q.add(n.left);
            }
            if(n.right!=null)
            {
                q.add(n.right);
            }
        }
        
    }
}
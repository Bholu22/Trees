class Spiral
{
    Stack<Node> s1=new Stack<Node>();
    Stack<Node> s2=new Stack<Node>();
      void printSpiral(Node node) 
      {
           // Your code here
           s1.push(node);
           while(!s1.isEmpty()|| !s2.isEmpty()){
               while(!s1.isEmpty()){
                   Node n=s1.pop();
                   System.out.print(n.data+" ");
                   if(n.right!=null)
                   {
                       s2.push(n.right);
                   }
                   if(n.left!=null)
                   {
                       s2.push(n.left);
                   }
               }
               while(!s2.isEmpty()){
                   Node n=s2.pop();
                   System.out.print(n.data+" ");
                   if(n.left!=null)
                   {
                       s1.push(n.left);
                       
                   }
                   if(n.right!=null){
                       s1.push(n.right);
                   }
               }
               
           }
      }
}

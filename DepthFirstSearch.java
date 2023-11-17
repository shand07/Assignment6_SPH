/**
 * 
 * @author shand
 *
 */
public class DepthFirstSearch 
{       
       Node root;
       int numOfNodes = 1;
       int height = 1;
       public DepthFirstSearch()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
                   System.out.print("Starting at the root node of our tree, the current value is: ");
                   
       }
       
       /**
        * 
        * @param node
        */
       public void DFS(Node node)        
        {
    	   	   
               System.out.println(node.getData()); 
               if(node.getlChild()!= null)
               {
            	   System.out.print("Moving to the left, the current left node value: ");
            	   DFS(node.getlChild());
            	   numOfNodes++;
            	   System.out.print("Moving to the right, current right node value: ");
            	   DFS(node.getrChild());
            	   System.out.println("Moving back a node..");
            	   numOfNodes++;
               }
               
              
        }
		
       /**
        * Prints total number of nodes counted.
        */
       public void nodeCount() 
		{
			
    	   System.out.println("There are " +numOfNodes+" nodes in this tree.");
			
		}
	   
       public int treeHeight(Node node) 
       {
           
    	   if (node == null) 
           {
               return 0; 
           } 
           
           else 
           {
           
	           int leftHeight = treeHeight(node.getlChild()); 
	           int rightHeight = treeHeight(node.getrChild()); 
	
	           return Math.max(leftHeight, rightHeight) + 1;
           }
           
          
           
       }

}
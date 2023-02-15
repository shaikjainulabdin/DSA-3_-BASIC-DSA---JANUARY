// https://course.acciojob.com/idle?question=b630c0be-f168-423f-9d7a-f3c4acfc36e6




import java.util.*;
import java.io.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    Node root = null;
    BST(){

    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        
        Solution Accio=new Solution();
        Accio.levelOrderTraversal(t.root);
    }
}

class Solution
{
    public static void levelOrderTraversal(Node root)
    {
		if(root == null)
		{
			return;
		}
		Queue<Node> que = new ArrayDeque<>();
		que.add(root);
		while(que.size() > 0)
			{
				int size = que.size();
				while(size > 0)
					{
						Node rNode = que.remove();
						System.out.print(rNode.val+ " ");
						if(rNode.left != null)
						{
							que.add(rNode.left);
						}
						if(rNode.right != null)
						{
							que.add(rNode.right);
						}
						size--;
					}
			}	
    }
    
}

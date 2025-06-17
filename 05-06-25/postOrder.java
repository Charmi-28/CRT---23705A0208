public class Main{
    public static void main(String[]args){
        Tree t=new Tree(new int[]{1,23,-1,-1,3,-1,-1});
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index=-1;
    Tree(int[]nodes){
        this.root = postOrder();
        System.out.println(index);
    }
    public Node postOrder(){
        Node temp=this.root;
        postOrderHelper(temp);
       
     
    }
    public void postOrderHelper(Node temp){
        if(temp==null)return;
        postOrderHelper(temp.left);
        postOrderHelper(temp.right);
         System.out.println(temp.data+" ");
    }
}
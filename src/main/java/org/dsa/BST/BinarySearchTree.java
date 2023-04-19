package org.dsa.BST;

public class BinarySearchTree {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("Root: " + myBST.getRoot());

    }

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }
    public Node getRoot() {
        return root;
    }

    public boolean insertNode(int value){
        Node newNode=new Node(value);
        if(root==null){

            root=newNode;
            return true;
        }
        else{
            Node temp=root;

            while(temp!=null){
                if(temp.value==newNode.value){
                    return false;
                }

                if( newNode.value < temp.value)
                {
                    if(temp.left==null)
                    {
                        temp.left=newNode;
                        return true;
                    }
                    else
                    {
                        temp=temp.left;
                    }
                }
                else
                {
                    if(temp.right==null)
                    {
                        temp.right=newNode;
                        return true;
                    }
                    else
                    {
                        temp=temp.right;
                    }
                }
            }
        }
        return false;
    }

}



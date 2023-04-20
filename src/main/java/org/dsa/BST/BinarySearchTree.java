package org.dsa.BST;

public class BinarySearchTree {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insertNode(10);
        myBST.insertNode(5);
        myBST.insertNode(14);
        myBST.insertNode(17);
        myBST.insertNode(12);
        myBST.insertNode(19);
        myBST.insertNode(4);
        myBST.insertNode(8);

        boolean result=myBST.Contains(22);
        if(result==true)
        {
            System.out.println("the number is in the list");
        }
        else {
            System.out.println("Number is not in the List");
        }

        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("Root: " + myBST.getRoot().left.value);

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

    public boolean Contains(int value){
            if(root==null)
            {
                return false;
            }
            Node temp=root;
            while(temp!=null)
            {
                if(value<temp.value)
                {
                    temp=temp.left;
                }
                else if(value>temp.value)
                {
                        temp=temp.right;
                }
                else if(value==temp.value)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        return false;
    }

}



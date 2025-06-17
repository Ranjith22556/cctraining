class Node {
    int data;
    Node left, right;
    Node(int x) {
        this.data = x;
        this.left = null;
        this.right = null;
    }
}
public class delete_bst {
    static Node insert(int v, Node root) {
        if (root == null) {
            return new Node(v);
        }
        if (v < root.data) {
            root.left = insert(v, root.left);
        } else {
            root.right = insert(v, root.right);
        }
        return root;
    }
    static Node delete(Node root, int key) { 
        if (root == null) return null;
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    static int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    static void inorder(Node p) {
        if (p == null) return;
        inorder(p.left);
        System.out.println(p.data);
        inorder(p.right);
    }
    static boolean search(int x,Node p){
        if (p!=null){
            if(x==p.data)
                return true;
            else if(x<p.data)
                return search(x, p.left);
            else
            return search(x,p.right);
        }
        else
        return false;
    }
    public static void main(String[] args) {
        Node root = null;
        root = insert(6, root);
        root = insert(15, root);
        root = insert(2, root);
        root = insert(9, root);
        System.out.println("ALL NODES using inorder:");
        inorder(root);
        System.out.println("Minimum element in the tree:");
        int min = findMin(root);
        System.out.println(min);
        System.out.println("Deleting node 15...");
        root = delete(root, 15);
        System.out.println("ALL NODES using inorder after deletion:");
        inorder(root);
        System.out.println("main ends");
        System.out.println("Searching for node 15...");
        boolean found = search(15,root);
        System.out.println("Node 15 found: " + found);
    }
}
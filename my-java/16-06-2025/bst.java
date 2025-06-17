class Node {
    int data;
    Node left, right;

    Node(int x) {
        this.data = x;
        this.left = null;
        this.right = null;
    }
}

public class bst {
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

    static void inorder(Node p) {
        if (p == null) return;
        inorder(p.left);
        System.out.println(p.data);
        inorder(p.right);
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(5, root);
        root = insert(15, root);
        System.out.println("ALL NODES using inorder:");
        inorder(root);
        System.out.println("main ends");
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        this.root = new Node(data);
    }

    int height(Node root) 
    {
        if (root == null)
            return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    void printAtLevel(Node root, int level) 
    {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printAtLevel(root.left, level - 1);
        printAtLevel(root.right, level - 1);
    }

    void levrec(Node root) 
    {
        if (root == null)
            return;
        int h = height(root);
        for (int i = 1; i <= h + 1; i++) {
            printAtLevel(root, i);
            System.out.println();
        }
    }
}

class levelOrderbtree {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree(2);
        bt.root.left = new Node(3);
        bt.root.right = new Node(5);
        bt.root.left.right = new Node(9);
        bt.root.right.left = new Node(7);
        bt.levrec(bt.root);
    }
}
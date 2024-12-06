/*77. Write a menu driven program to implement Binary Search Tree (BST) & perform 
following operations:
-Insert a node, Delete a node, Search a node
//-------------------------------------------------------------------------
78. Write a menu driven program to implement Binary Search Tree (BST) & perform 
following operations
- Preorder Traversal, Postorder Traversal, Inorder Traversal*/
import java.util.Scanner;

    public class Bst { 
        class TreeNode{
            int value ;
            TreeNode left;
            TreeNode right;

        TreeNode(int value){
            this.value=value;
            this.left=null;
            this.left=null;
        }
    }

    class BinarySearchTree{
      TreeNode root;
        BinarySearchTree(){
            root=null;
      }
    
        // Insert a node
        void insert(int value) {
            root = insertRec(root, value);
        }

        TreeNode insertRec(TreeNode root, int value) {
            if (root == null) {
                root = new TreeNode(value);
                return root;
            }

            if (value < root.value) {
                root.left = insertRec(root.left, value);
            } else if (value > root.value) {
                root.right = insertRec(root.right, value);
            }

            return root;
        }

        // Delete a node
        TreeNode deleteRec(TreeNode root, int value) {
            if (root == null) {
                return root;
            }

            if (value < root.value) {
                root.left = deleteRec(root.left, value);
            } else if (value > root.value) {
                root.right = deleteRec(root.right, value);
            } else {
                // Node with one or no children
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                // Node with two children: Get the inorder successor (smallest in the right subtree)
                root.value = minValue(root.right);

                // Delete the inorder successor
                root.right = deleteRec(root.right, root.value);
            }

            return root;
        }

        int minValue(TreeNode root) {
            int minValue = root.value;
            while (root.left != null) {
                root = root.left;
                minValue = root.value;
            }
            return minValue;
        }

        // Search for a node
        boolean search(int value) {
            return searchRec(root, value);
        }

        boolean searchRec(TreeNode root, int value) {
            if (root == null) {
                return false;
            }
            if (value == root.value) {
                return true;
            } else if (value < root.value) {
                return searchRec(root.left, value);
            } else {
                return searchRec(root.right, value);
            }
        }

        // Inorder traversal
        void inorder() {
            inorderRec(root);
        }

        void inorderRec(TreeNode root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.value + " ");
                inorderRec(root.right);
            }
        }

        // Preorder traversal
        void preorder() {
            preorderRec(root);
        }

        void preorderRec(TreeNode root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }

        // Postorder traversal
        void postorder() {
            postorderRec(root);
        }

        void postorderRec(TreeNode root) {
            if (root != null) {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.value + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bst bst = new Bst();
        BinarySearchTree tree = bst.new BinarySearchTree();
        tree.insert(10);
        tree.insert(30);
        tree.insert(20);
        tree.insert(96);
        tree.insert(98);
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println("\nPreorder traversal:");
        tree.preorder();
        System.out.println("\nPostorder traversal:");
        tree.postorder();
        System.out.println("\nSearch for 20: " + tree.search(20));
        System.out.println("Search for 100: " + tree.search(100));
    }
}

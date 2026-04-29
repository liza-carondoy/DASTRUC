/*Name: Liza Carondoy
  Date: April 15, 2026 */
  
public class BTClass {
    protected BTNode root;

    public BTClass() {
        root = null;
    }

    public BTClass(BTNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void inOrderTraversal() {
        System.out.print("In-Order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(BTNode node) {
        if (node != null) {
            inOrder(node.llink);
            System.out.print(node.info + " ");
            inOrder(node.rlink);
        }
    }

    public void postOrderTraversal() {
        System.out.print("Post-Order Traversal: ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(BTNode node) {
        if (node != null) {
            postOrder(node.llink);
            postOrder(node.rlink);
            System.out.print(node.info + " ");
        }
    }

    public void preOrderTraversal() {
        System.out.print("Pre-Order Traversal: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(BTNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preOrder(node.llink);
            preOrder(node.rlink);
        }
    }

    public int height() {
        return computeHeight(root);
    }

    private int computeHeight(BTNode node) {
        if (node == null) return 0;
        int leftHeight = computeHeight(node.llink);
        int rightHeight = computeHeight(node.rlink);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int NodeCount() {
        return countNodes(root);
    }

    private int countNodes(BTNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.llink) + countNodes(node.rlink);
    }
}
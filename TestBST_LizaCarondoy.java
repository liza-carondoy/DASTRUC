/*Name: Liza Carondoy
  Date: April 15, 2026 */
  
import java.util.Scanner;

public class TestBST_LizaCarondoy {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n BINARY SEARCH TREE MENU" );
            System.out.println("1. Insert Data");
            System.out.println("2. Search");
            System.out.println("3. Node Count");
            System.out.println("4. Height");
            System.out.println("5. In-Order Traversal");
            System.out.println("6. Pre-Order Traversal");
            System.out.println("7. Post-Order Traversal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertVal = scanner.nextInt();
                    bst.insert(insertVal);
                    break;

                case 2:
                    System.out.print("Enter value to search: ");
                    int searchVal = scanner.nextInt();
                    if (bst.search(searchVal)) {
                        System.out.println(searchVal + " was FOUND in the tree.");
                    } else {
                        System.out.println(searchVal + " was NOT FOUND in the tree.");
                    }
                    break;

                case 3:
                    System.out.println("Node Count: " + bst.NodeCount());
                    break;

                case 4:
                    System.out.println("Tree Height: " + bst.height());
                    break;

                case 5:
                    if (bst.isEmpty()) {
                        System.out.println("Tree is empty.");
                    } else {
                        bst.inOrderTraversal();
                    }
                    break;

                case 6:
                    if (bst.isEmpty()) {
                        System.out.println("Tree is empty.");
                    } else {
                        bst.preOrderTraversal();
                    }
                    break;

                case 7:
                    if (bst.isEmpty()) {
                        System.out.println("Tree is empty.");
                    } else {
                        bst.postOrderTraversal();
                    }
                    break;

                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
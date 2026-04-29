/*Name: Liza Carondoy
  Date: April 15, 2026 */
  
public class BTNode {
    public int info;
    public BTNode rlink;
    public BTNode llink;

    public BTNode() {
        info = 0;
        rlink = null;
        llink = null;
    }

    public BTNode(BTNode rlink, int info, BTNode llink) {
        this.info = info;
        this.rlink = rlink;
        this.llink = llink;
    }
}
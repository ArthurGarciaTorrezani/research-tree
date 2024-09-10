public class BinaryTree {
     Node root;

     public BinaryTree() {
          root = null;
     }

     public void insert(Node newNode) {
          root = insertNewNode(newNode, root);
     }

     private Node insertNewNode(Node newNode, Node current) {

          if (current == null)
               return newNode; // dois tres testando final

          String wordDad = current.getword();
          String wordSon = newNode.getword();

          if (wordDad.compareTo(wordSon) < 0) {
               current.setRight(insertNewNode(newNode, current.getRight()));
          }
          if (wordDad.compareTo(wordSon) > 0) {
               current.setLeft(insertNewNode(newNode, current.getLeft()));
          }
          if (wordDad.compareTo(wordSon) == 0) {
               current.setLines(newNode.getFirstLine());
          }

          return current;
     }

     public void order() {
          order(root);
     }

     private void order(Node element) {
          if (element != null) {
               order(element.getLeft()); // E
               System.out.println(element.getword() + " " + element.getListLines().imprimir()); // R
               order(element.getRight()); // D
          }
     }

}

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

          String wordDad = current.getValue();
          String wordSon = newNode.getValue();
          
          if (wordDad.compareTo(wordSon) < 0) {
               System.out.println(wordDad.compareTo(wordSon) +  " " +wordDad +" " + wordSon);
               current.setRight(insertNewNode(newNode, current.getRight()));
          }
          if (wordDad.compareTo(wordSon) > 0) {
               System.out.println(wordDad.compareTo(wordSon) +  " " +wordDad +" " + wordSon);
               current.setLeft(insertNewNode(newNode, current.getLeft()));
          }
          if(wordDad.compareTo(wordSon) == 0){
               System.out.println(wordDad.compareTo(wordSon) +  " " +wordDad +" " + wordSon);
               current.setLines(current.getLines() + newNode.getLines());
          }

          return current;
     }

     public void preOrder() {
          preOrder(root);
     }

     private void preOrder(Node element) {
          if (element != null) {
               System.out.println(element.getValue() +" " +element.getLines()); // R
               preOrder(element.getLeft()); // E
               preOrder(element.getRight()); // D
          }
     }

}

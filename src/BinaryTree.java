public class BinaryTree {
     Node root;
     Alphabet alphabet = new Alphabet();

     public BinaryTree() {
          root = null;
     }

     public void insert(Node newNode) {
          root = insertNewNode(newNode, root);
     }

     private Node insertNewNode(Node newNode, Node current) {

          char firstLetterDad = newNode.getValue().charAt(0);
          char firstLetterSon = newNode.getValue().charAt(0);

          if (current == null)
               return newNode;
          if (alphabet.getValue(firstLetterSon) > alphabet.getValue(firstLetterDad)) {
               current.setRight(insertNewNode(newNode, current.getRight()));
          }
          if (alphabet.getValue(firstLetterSon) < alphabet.getValue(firstLetterDad)) {
               current.setLeft(insertNewNode(newNode, current.getLeft()));
          }
          if (alphabet.getValue(firstLetterSon) == alphabet.getValue(firstLetterDad)) {
               insertNewNode(newNode, current);
          }


          return current;
     }

     

}

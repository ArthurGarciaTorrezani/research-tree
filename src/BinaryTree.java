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

          if (current == null)
               return newNode;

          String wordDad = current.getValue();
          String wordSon = newNode.getValue();

          char firstLetterDad = wordDad.charAt(0);
          char firstLetterSon = wordSon.charAt(0);

          
          if (alphabet.getValue(firstLetterSon) > alphabet.getValue(firstLetterDad)) {
               current.setRight(insertNewNode(newNode, current.getRight()));
          }
          if (alphabet.getValue(firstLetterSon) < alphabet.getValue(firstLetterDad)) {
               current.setLeft(insertNewNode(newNode, current.getLeft()));
          }
          if (alphabet.getValue(firstLetterSon) == alphabet.getValue(firstLetterDad)) {

               Node verificado = checkLetter(current, newNode, 1);

               if(verificado.equals(current)){ // se o pai vem antes
                    current.setRight(insertNewNode(newNode, current.getRight()));
               }else{ // se o pai vem depois
                    current.setLeft(insertNewNode(newNode, current.getLeft()));
               }
          }

          return current;
     }

     private Node checkLetter(Node dad, Node son, int index) {

          String wordDad = dad.value;
          String wordSon = son.value;

          char charDad = wordDad.charAt(index);
          char charSon = wordSon.charAt(index);

          if (alphabet.getValue(charSon) > alphabet.getValue(charDad)) {
               return dad;
          } else if (alphabet.getValue(charSon) < alphabet.getValue(charDad)) {
               return son;
          } else {
               return checkLetter(dad, son, index + 1);
          }

     }

     public void preOrder() {
          preOrder(root);
     }

     private void preOrder(Node element) {
          if (element != null) {
               System.out.println(element.getValue()); // R
               preOrder(element.getLeft()); // E
               preOrder(element.getRight()); // D
          }
     }

}

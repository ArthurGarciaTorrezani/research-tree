public class BinaryTree {

     Node root;

     public BinaryTree() {
          root = null;
     }

     // Inserção normal usando a árvore balanceada
     public void insert(Node newNode) {
          root = insertNewNode(newNode, root);
     }

     // Inserção de um novo nó com balanceamento AVL
     private Node insertNewNode(Node newNode, Node current) {
          if (current == null) 
               return newNode;

          String wordDad = current.getword();
          String wordSon = newNode.getword();

          if (wordDad.compareTo(wordSon) < 0) {
               current.setRight(insertNewNode(newNode, current.getRight()));
          } else if (wordDad.compareTo(wordSon) > 0) {
               current.setLeft(insertNewNode(newNode, current.getLeft()));
          } else {
               current.setLines(newNode.getFirstLine());
               return current;
          }

          // Atualizar a altura do nó atual
          current.setHeight(1 + Math.max(getHeight(current.getLeft()), getHeight(current.getRight())));

          // Balancear o nó
          return balanceNode(current);
     }

     // Método para obter a altura de um nó (nulo significa 0)
     private int getHeight(Node node) {
          if (node == null) return 0;
          return node.getHeight();
     }

     // Método para calcular o fator de balanceamento
     private int getBalance(Node node) {
          if (node == null) return 0;
          return getHeight(node.getLeft()) - getHeight(node.getRight());
     }

     // Método para balancear o nó
     private Node balanceNode(Node node) {
          int balance = getBalance(node);

          // Caso 1: Rotação à direita
          if (balance > 1 && getBalance(node.getLeft()) >= 0) {
               return rotateRight(node);
          }

          // Caso 2: Rotação à esquerda
          if (balance < -1 && getBalance(node.getRight()) <= 0) {
               return rotateLeft(node);
          }

          // Caso 3: Rotação à esquerda-direita
          if (balance > 1 && getBalance(node.getLeft()) < 0) {
               node.setLeft(rotateLeft(node.getLeft()));
               return rotateRight(node);
          }

          // Caso 4: Rotação à direita-esquerda
          if (balance < -1 && getBalance(node.getRight()) > 0) {
               node.setRight(rotateRight(node.getRight()));
               return rotateLeft(node);
          }

          return node;
     }

     // Rotação à direita
     private Node rotateRight(Node y) {
          Node x = y.getLeft();
          Node T2 = x.getRight();

          // Executa a rotação
          x.setRight(y);
          y.setLeft(T2);

          // Atualiza as alturas
          y.setHeight(Math.max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);
          x.setHeight(Math.max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);

          // Retorna a nova raiz
          return x;
     }

     // Rotação à esquerda
     private Node rotateLeft(Node x) {
          Node y = x.getRight();
          Node T2 = y.getLeft();

          // Executa a rotação
          y.setLeft(x);
          x.setRight(T2);

          // Atualiza as alturas
          x.setHeight(Math.max(getHeight(x.getLeft()), getHeight(x.getRight())) + 1);
          y.setHeight(Math.max(getHeight(y.getLeft()), getHeight(y.getRight())) + 1);

          // Retorna a nova raiz
          return y;
     }

     public void order() {
          order(root);
     }

     private void order(Node element) {
          if (element != null) {
               order(element.getLeft());
               System.out.println(element.getword() + " " + element.getListLines().imprimir());
               order(element.getRight());
          }
     }
}

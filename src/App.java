public class App{
     public static void main(String[] args) {
          BinaryTree bin = new BinaryTree();
          bin.insert(new Node("oi","1"));
          bin.insert(new Node("oj","1"));
          bin.insert(new Node("oa","1"));

          bin.preOrder();
     }
} 
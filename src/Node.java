public class Node {
     private Node right;
     private Node left;
     private ListLine liness;
     private String word;
     private int firstLine;

     public Node(String word, int line){
          this.word = word;
          this.firstLine = line;
          liness = new ListLine();
          liness.insertEnd(new Line(line));
     }

     public ListLine getListLines(){
          return liness;
     }

     public int getFirstLine(){
          return firstLine;
     }

     public void setLines(int line) {
          liness.insertEnd(new Line(line));
     }

     public Node getRight() {
          return right;
     }

     public void setRight(Node right) {
          this.right = right;
     }

     public Node getLeft() {
          return left;
     }

     public void setLeft(Node left) {
          this.left = left;
     }

     public String getword() {
          return word;
     }

     public void setword(String word) {
          this.word = word;
     }

}

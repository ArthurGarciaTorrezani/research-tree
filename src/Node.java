public class Node {
     private Node right;
     private Node left;
     private ListLine liness;
     private String word;
     private int firstLine;
     private int height;
     public Node(String word, int line){
          this.word = word;
          this.firstLine = line;
          liness = new ListLine();
          liness.insertEnd(new Line(line));
          height = 1;
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

     public int getHeight() {
          return height;
     }

     public void setHeight(int height) {
          this.height = height;
     }

}

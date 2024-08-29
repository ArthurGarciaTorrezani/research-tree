public class Node {
     private Node right;
     private Node left;
     private String lines;
     private String value;

     public Node(String value, String line){
          this.value = value;
          lines = line;
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

     public String getLines() {
          return lines;
     }

     public void setLines(String lines) {
          this.lines = lines;
     }

     public String getValue() {
          return value;
     }

     public void setValue(String value) {
          this.value = value;
     }

}

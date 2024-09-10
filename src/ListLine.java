public class ListLine {
     private Line firstLine;

     public ListLine() {
          firstLine = null;
     }

     public void insertEnd(Line line) {
          if (isEmpty()) {
               firstLine = line;
          }else{
               
          Line aux = firstLine;

          while (aux.getProx() != null) {    
               aux = aux.getProx();
          }

          aux.setProx(line);
          }

     }

     public Line getFirstLine() {
          if (isEmpty()) {
               return null;
          }
          return firstLine;
     }

     public boolean isEmpty() {
          if (firstLine == null) {
               return true;
          }
          return false;
     }

     public String imprimir(){
          Line aux = firstLine;
          String lines = "";
          while(aux.getProx() != null){
               lines += (aux.getLine() + ", ");
              aux = aux.getProx();
          }
          lines += (aux.getLine());
          return lines;
      }

}

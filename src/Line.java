public class Line {
     private int line;
     private Line prox;

     public Line(int line){
          this.line = line;
          this.prox = null;
     }

     public int getLine(){
          return line;
     }

     public Line getProx(){
          return prox;
     }

     public void setProx(Line line){
          prox = line;
     }
}

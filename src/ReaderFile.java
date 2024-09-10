import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderFile {

     public static void Reader(String path) {
          
          try {
               FileReader archive = new FileReader(path);
               BufferedReader reader = new BufferedReader(archive);
               String line = reader.readLine();

               int contLine = 1;
               BinaryTree tree = new BinaryTree();

               while (line != null) {
                    line = line.replace(",", "");
                    line = line.replace(".", "");
                    String[] words = line.split(" ");
                   

                    for (String word : words) {
                         word = word.toLowerCase();
                         if(word.length() > 2){
                              tree.insert(new Node(word, contLine));
                         }
                        
                    }

                    contLine++;
                    line = reader.readLine();
               }
               tree.order();
               reader.close();

          } catch (IOException e) {
               System.err.printf("Error opening file: %s\n", e.getMessage());
          }

     }

}

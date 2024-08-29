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
                    String[] words = line.split(" ");
                   

                    for (String word : words) {
                         tree.insert(new Node(word.toLowerCase(), " "+contLine));
                    }

                    contLine++;
                    line = reader.readLine();
               }
               tree.preOrder();
               reader.close();

          } catch (IOException e) {
               System.err.printf("Error opening file: %s\n", e.getMessage());
          }

     }

}

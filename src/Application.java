import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        DuplicateCounter ob = new DuplicateCounter();


        ob.count("problem2.txt");

        ob.write("unique_word_counts.txt");

    }

}
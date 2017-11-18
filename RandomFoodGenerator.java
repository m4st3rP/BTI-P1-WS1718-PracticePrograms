import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomFoodGenerator {
    public static void main(String[] args) {
        try {
            String readLine;
            ArrayList<String> list = new ArrayList<String>();
            BufferedReader reader;
            reader = new BufferedReader(new FileReader("food.txt"));

            while ((readLine = reader.readLine()) != null) {
                list.add(readLine);
            }
            reader.close();
            Random randomizer = new Random();
            String random = list.get(randomizer.nextInt(list.size()));
            System.out.println(random);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

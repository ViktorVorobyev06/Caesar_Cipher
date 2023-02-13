import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public final class BruteForce {
    public static void bruteForce(String path) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
                FileWriter fileWriter = new FileWriter("BruteForce.txt")) {

            String s;
            StringBuilder message = new StringBuilder();
            while ((s = br.readLine()) != null) {
                message.append(s);
                fileWriter.write(CaesarCipher.bruteForce(message.toString()));
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

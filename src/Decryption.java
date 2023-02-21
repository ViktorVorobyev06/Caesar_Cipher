import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public final class Decryption {
    public static void decryption(String path, int offset) {
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             FileWriter fileWriter = new FileWriter("outputDecrypt.txt")) {

            String s;
            StringBuilder message = new StringBuilder();
            while ((s=br.readLine())!=null) {
                message.append(s);
            }
            fileWriter.write(CaesarCipher.decipher(message.toString(), offset));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

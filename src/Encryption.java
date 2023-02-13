import java.io.*;

public final class Encryption {
    public static void encryption(String path, int offset) {
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             FileWriter fileWriter = new FileWriter("outputEncrypt.txt")) {
            String s;
            StringBuilder message=new StringBuilder();

            while ((s=br.readLine())!=null) {
                message.append(s);
            }
            fileWriter.write(CaesarCipher.cipher(message.toString(), offset));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

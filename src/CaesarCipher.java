import java.nio.charset.StandardCharsets;
import java.util.*;

public class CaesarCipher {
    public String cipher(String message, int offset) {
        message = message.replaceAll("[^а-яА-Я]\\d\\w[0-9]", " ");
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (!Character.isDigit(character)&&Character.isUpperCase(character)&&Character.isLetter(character)) {
                int newAlphabet = character - 'А';
                newAlphabet += offset;
                newAlphabet = Math.floorMod(newAlphabet,32);
                newAlphabet += 'А';
                result.append((char) newAlphabet);
            } else if (!Character.isDigit(character)&&Character.isLowerCase(character)&&Character.isLetter(character)) {
                int newAlphabet = character - 'а';
                newAlphabet += offset;
                newAlphabet = Math.floorMod(newAlphabet,32);
                newAlphabet += 'а';
                result.append((char) newAlphabet);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public String decipher(String message, int offset) {
        message = message.replaceAll("[^а-яА-Я]\\d\\w[0-9]", " ");
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (!Character.isDigit(character)&&Character.isUpperCase(character)&&Character.isLetter(character)) {
                int newAlphabet = character - 'А';
                newAlphabet -= offset;
                newAlphabet = Math.floorMod(newAlphabet,32);
                newAlphabet += 'А';
                result.append((char) newAlphabet);
            } else if (!Character.isDigit(character)&&Character.isLowerCase(character)&&Character.isLetter(character)) {
                int newAlphabet = character - 'а';
                newAlphabet -= offset;
                newAlphabet = Math.floorMod(newAlphabet,32);
                newAlphabet += 'а';
                result.append((char) newAlphabet);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public void bruteForce(String ciphertext) {
        for (int offset = 1; offset < 33; offset++)
            System.out.println("Offset№" + offset + ": " + decipher(ciphertext, offset));
    }
}

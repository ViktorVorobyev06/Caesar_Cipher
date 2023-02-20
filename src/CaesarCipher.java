import java.nio.charset.StandardCharsets;
import java.util.*;

public final class CaesarCipher {
    public static String cipher(String message, int offset) {
        message = message.replaceAll("[^а-яА-Я0xCB0xEB]\\d\\w[0-9]", " ");
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (!Character.isDigit(character) && Character.isUpperCase(character) && Character.isLetter(character)) {
                int newAlphabet = character - 'А';
                newAlphabet += offset;
                newAlphabet = Math.floorMod(newAlphabet, 32);
                newAlphabet += 'А';
                result.append((char) newAlphabet);
            } else if (!Character.isDigit(character) && Character.isLowerCase(character) && Character.isLetter(character)) {
                int newAlphabet = character - 'а';
                newAlphabet += offset;
                newAlphabet = Math.floorMod(newAlphabet, 32);
                newAlphabet += 'а';
                result.append((char) newAlphabet);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decipher(String message, int offset) {
        message = message.replaceAll("[^а-яА-Я0xCB]\\d\\w[0-9]", " ");
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (!Character.isDigit(character) && Character.isUpperCase(character) && Character.isLetter(character)) {
                int newAlphabet = character - 'А';
                newAlphabet -= offset;
                newAlphabet = Math.floorMod(newAlphabet, 32);
                newAlphabet += 'А';
                result.append((char) newAlphabet);
            } else if (!Character.isDigit(character) && Character.isLowerCase(character) && Character.isLetter(character)) {
                int newAlphabet = character - 'а';
                newAlphabet -= offset;
                newAlphabet = Math.floorMod(newAlphabet, 32);
                newAlphabet += 'а';
                result.append((char) newAlphabet);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String bruteForce(String ciphertext) {
        StringBuilder result = new StringBuilder();
        for (int offset = 1; offset < 33; offset++) {
            result.append("Offset№" + offset + ": " + decipher(ciphertext, offset)+"\n");
        }
        return result.toString();
    }
}

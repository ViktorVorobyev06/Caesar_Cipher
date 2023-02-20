import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выбери что тебе нужно сделать с Файлом"
                + "\n1. Encryption" + "\n2. Decryption"
                + "\n3. BruteForce");
        String path=null;
        int offset=0;

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введи путь к файлу");
                input = new Scanner(System.in);
                path = input.nextLine();

                System.out.println("Введи сдвиг");
                offset = input.nextInt();

                Encryption.encryption(path, offset);
                break;
            case 2:
                System.out.println("Введи путь к файлу");
                input = new Scanner(System.in);
                path = input.nextLine();

                System.out.println("Введи сдвиг");
                offset = input.nextInt();

                Decryption.decryption(path, offset);
                break;
            case 3:
                System.out.println("Введи путь к файлу");
                input = new Scanner(System.in);
                path = input.nextLine();
                BruteForce.bruteForce(path);
                break;
            default:
                System.out.println("Ты не чего не выбрал перезапусти");
                break;
        }
    }
}
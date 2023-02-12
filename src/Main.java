

public class Main {
    public static void main(String[] args) {
CaesarCipher caesarCipher=new CaesarCipher();
String ciMessage=caesarCipher.cipher("Глаза умеют говорить. Кричать от счастья или плакать.\n" +
        "Глазами можно ободрить, с ума свести, заставить плакать.\n" +
        "Словами можно обмануть, глазами это невозможно.\n" +
        "Во взгляде можно утонуть, если смотреть неосторожно.",3);
        System.out.println(ciMessage);
        System.out.println("---------------------Decrypt-------------------------");
        System.out.println(caesarCipher.decipher(ciMessage,3));

    }
}


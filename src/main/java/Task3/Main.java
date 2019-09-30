package Task3;

public class Main {

    public static void main(String[] args) {
        String ex = "Mauer";
        Base64 b64 = new Base64();
        String base64 = b64.stringToBase64(ex);
        String string = b64.base64ToString(base64);
        System.out.println(ex);
        System.out.println(base64);
        System.out.println(string);
    }

}

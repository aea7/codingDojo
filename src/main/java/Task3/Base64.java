package Task3;

public class Base64 {

    String stringToBase64(String source) {
        return java.util.Base64.getEncoder().encodeToString(source.getBytes());
    }

    String base64ToString(String source) {
        return new String(java.util.Base64.getDecoder().decode(source));
    }

}

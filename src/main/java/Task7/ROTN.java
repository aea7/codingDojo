package Task7;

import java.util.ArrayList;

public class ROTN {

    public String toROTN(String source, int rotN) {
        ArrayList<String> letters = new ArrayList<>();

        StringBuilder out = new StringBuilder();
        char currentChar;

        for(int i=0; i< source.length();i++){
            currentChar = source.charAt(i);
            char encryptedChar;
            if((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')){
                encryptedChar = (char) (currentChar + rotN);
                if(currentChar >= 'a' && encryptedChar > 'z' || currentChar <= 'Z' && encryptedChar > 'Z')
                    encryptedChar -= 'z' - 'a' + 1;
            } else {
                encryptedChar = currentChar;
            }
            if(((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')||
                    (currentChar >= '0' && currentChar <= '9')) && letters.indexOf(currentChar+"") == -1){
                letters.add(currentChar+"");
            }
            out.append(encryptedChar);
        }

        return out.toString().toUpperCase();
    }
}

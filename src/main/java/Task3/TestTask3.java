package Task3;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask3 {

    @Test
    public void testBase64ToString()
    {
        Base64 b64 = new Base64();
        String source = "TWF1ZXI=";
        assertEquals("Mauer", b64.base64ToString(source));
    }

    @Test
    public void testStringToBase64()
    {
        Base64 b64 = new Base64();
        String source = "Mauer";
        assertEquals("TWF1ZXI=", b64.stringToBase64(source));
    }

}

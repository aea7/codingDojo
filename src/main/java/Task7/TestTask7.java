package Task7;

import Task4.Student;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static org.junit.Assert.assertEquals;

public class TestTask7 {

    @Test
    public void testROTN() {
        assertEquals("URYYB, JBEYQ", new ROTN().toROTN("Hello, World", 13));
    }

}

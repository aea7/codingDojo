package Task4;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static org.junit.Assert.assertEquals;

public class TestTask4 {

    @Test
    public void textXMLConversion() throws JAXBException {
        Student s = new Student("Abdullah", 15123);

        //Write XML to file
        File file = new File("src/main/java/Task4/student.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(s, file);

        //Read XML file and put it into Student object
        Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
        Student newStudent = (Student) jaxbUnMarshaller.unmarshal(file);

        assertEquals("Abdullah", newStudent.getName());
    }

}

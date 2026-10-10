package TransformarDocumento;
import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

public class Transformador {
	
	public static void main(String[] args) {
		
		try {
			File xmlFile = new File("persona.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Persona.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Object objeto = unmarshaller.unmarshal(xmlFile);
			
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			
			File jsonFile = new File("persona.json");
			mapper.writeValue(jsonFile, objeto);
			
            System.out.println("Archivo convertido a JSON con éxito.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



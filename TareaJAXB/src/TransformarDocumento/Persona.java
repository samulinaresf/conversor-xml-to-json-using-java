package TransformarDocumento;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "persona")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona{
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public Persona(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	// Getters para nombre, apellido1 y apellido 2
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido1() {
        return apellido1;
    }
    
    public String getApellido2() {
        return apellido2;
    }

    // Setter para nombre, apellido1 y apellido2
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public Persona() {
    }
}

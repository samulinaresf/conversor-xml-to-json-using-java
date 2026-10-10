module TareaJAXB {
    requires jakarta.xml.bind;
    requires com.fasterxml.jackson.databind;

    opens TransformarDocumento to jakarta.xml.bind, com.fasterxml.jackson.databind;
}
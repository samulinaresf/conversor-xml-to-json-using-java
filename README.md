# XML to JSON Converter

A simple Java application that converts XML files into JSON using **JAXB** and **Jackson**.

This project was developed as part of a Data Access assignment in the Higher Vocational Training Programme in Multiplatform Application Development (DAM).

## Technologies Used

- **Java 24** — Main programming language.
- **JAXB** — Converts XML data into Java objects.
- **Jackson** — Serializes Java objects into JSON.
- **Maven** — Manages project dependencies.

## How It Works

The application follows four main steps:

1. Reads an XML file named `persona.xml`.
2. Uses JAXB to deserialize the XML into a `Persona` Java object.
3. Uses Jackson to serialize the Java object into JSON.
4. Saves the result in a file named `persona.json`.

The generated JSON is formatted with indentation to improve readability.

## Example

**Input — persona.xml**

```xml
<persona>
    <nombre>Juan</nombre>
    <apellido1>Pérez</apellido1>
    <apellido2>Pérez</apellido2>
</persona>
```

**Output — persona.json**

```json
{
  "nombre": "Juan",
  "apellido1": "Pérez",
  "apellido2": "Pérez"
}
```

## Project Structure

```text
TareaJAXB/
├── src/
│   ├── TransformarDocumento/
│   │   ├── Persona.java
│   │   └── Transformador.java
│   └── module-info.java
├── persona.xml
├── persona.json
├── pom.xml
└── .gitignore
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse IDE.
3. Make sure Java 24 and Maven are configured.
4. Update Maven dependencies if necessary.
5. Run `Transformador.java` as a Java application.
6. Check the generated `persona.json` file in the project's working directory.

## Error Handling

The application uses a `try-catch` block to handle exceptions during XML reading and JSON generation. If an error occurs, the stack trace is printed to the console.

## Future Improvements

- Allow users to specify input and output file paths.
- Add support for converting JSON back to XML.
- Implement more specific exception handling.
- Add automated tests.

## Learning Objectives

This project demonstrates basic knowledge of Java file handling, XML processing, JSON serialization, external libraries, Maven dependency management, and exception handling.

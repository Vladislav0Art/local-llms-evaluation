package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestDirectivesBuilderNoElements {

    @Test
    public void testDirectivesBuilderNoElements() {
        // Arrange
        Class<?> elementClass = NoElement.class;
        String expectedOutput = "";

        // Act
        String output = new DirectivesBuilder(elementClass).build();

        // Assert
        assertEquals(expectedOutput, output);
    }

}
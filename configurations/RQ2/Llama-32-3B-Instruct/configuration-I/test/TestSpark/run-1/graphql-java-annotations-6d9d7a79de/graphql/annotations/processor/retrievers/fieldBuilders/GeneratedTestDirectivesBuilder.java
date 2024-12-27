package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestDirectivesBuilder {

    @Test
    public void testDirectivesBuilder() {
        // Arrange
        Class<?> elementClass = Element.class;
        String expectedOutput = "@directive1\n@directive2";

        // Act
        String output = new DirectivesBuilder(elementClass).build();

        // Assert
        assertEquals(expectedOutput, output);
    }

}
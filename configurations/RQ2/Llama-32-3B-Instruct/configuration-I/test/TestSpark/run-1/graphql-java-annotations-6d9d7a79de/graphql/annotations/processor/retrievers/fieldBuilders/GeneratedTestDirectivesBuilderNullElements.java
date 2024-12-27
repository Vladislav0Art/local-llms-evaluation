package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestDirectivesBuilderNullElements {

    @Test
    public void testDirectivesBuilderNullElements() {
        // Arrange
        Class<?> elementClass = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> new DirectivesBuilder(elementClass).build());
    }
}

class Element {
    // No content
}

}
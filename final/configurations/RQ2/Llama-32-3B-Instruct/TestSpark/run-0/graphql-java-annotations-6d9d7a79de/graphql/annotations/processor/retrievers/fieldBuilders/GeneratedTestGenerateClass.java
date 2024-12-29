package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGenerateClass {

    @Mock
    public String graphQLDirective;

    @Test
    public void testGenerateClass() {
        // Arrange
        Mockito.when(graphQLDirective).thenReturn("class Test");

        // Act
        String generatedClass = GeneratePublicClass(graphQLDirective);

        // Assert
        assertEquals("public class Test", generatedClass);
    }

}
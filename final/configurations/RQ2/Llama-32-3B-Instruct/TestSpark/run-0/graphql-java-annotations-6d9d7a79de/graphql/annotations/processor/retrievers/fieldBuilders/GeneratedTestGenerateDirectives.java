package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestGenerateDirectives {

    @Mock
    public String graphQLDirective;

    @Test
    public void testGenerateDirectives() {
        // Arrange
        Mockito.when(graphQLDirective).thenReturn("method add(int param)");

        // Act
        List<String> generatedDirectives = GeneratePublicMethod(graphQLDirective);

        // Assert
        assertEquals("", generatedDirectives);
    }

}
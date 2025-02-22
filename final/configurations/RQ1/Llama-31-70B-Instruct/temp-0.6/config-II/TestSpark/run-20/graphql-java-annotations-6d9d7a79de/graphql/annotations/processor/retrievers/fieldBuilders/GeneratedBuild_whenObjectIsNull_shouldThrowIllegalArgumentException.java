package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;

import java.lang.reflect.AnnotatedElement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

public class GeneratedBuild_whenObjectIsNull_shouldThrowIllegalArgumentException {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void build_whenObjectIsNull_shouldThrowIllegalArgumentException() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, container);

        // Act and Assert
        assertThrows(IllegalArgumentException.class, directivesBuilder::build);
    }

}
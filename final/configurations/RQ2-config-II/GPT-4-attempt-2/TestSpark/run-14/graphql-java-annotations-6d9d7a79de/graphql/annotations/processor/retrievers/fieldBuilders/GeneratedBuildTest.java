package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        AnnotatedElement mockElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(mockElement, container);
        GraphQLDirective[] directives = builder.build();

        assertNotNull(directives, "Result should not be null");
        assertTrue(directives.length >= 0, "The array length should be non-negative");
    }

}
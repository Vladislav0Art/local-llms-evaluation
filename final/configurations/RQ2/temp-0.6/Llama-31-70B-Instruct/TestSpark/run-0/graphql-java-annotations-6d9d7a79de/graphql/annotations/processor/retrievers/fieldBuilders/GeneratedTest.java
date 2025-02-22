package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildWithoutGraphQLDirectivesAnnotationReturnsDirectivesFromDirectiveAnnotations() {
        // Arrange
        Annotation annotation = mock(Annotation.class);
        when(annotation.annotationType()).thenReturn((Class) GraphQLDirectives.class);

        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);

        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        when(processingElementsContainer.getDirectiveRegistry()).thenReturn(Map.of("directive", graphQLDirective));

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mock(AnnotatedElement.class), processingElementsContainer);

        // Act
        GraphQLDirective[] directives = directivesBuilder.build();

        // Assert
        assertEquals(1, directives.length);
        assertEquals(graphQLDirective, directives[0]);
    }

}
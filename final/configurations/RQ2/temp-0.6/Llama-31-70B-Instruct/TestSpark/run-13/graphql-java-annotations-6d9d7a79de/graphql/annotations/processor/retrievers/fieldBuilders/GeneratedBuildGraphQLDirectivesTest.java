package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildGraphQLDirectivesTest {

    @Test
    public void buildGraphQLDirectivesTest() {
        // Arrange
        AnnotatedElement mockElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockElement, mockContainer);
        when(mockElement.getAnnotation(GraphQLDirectives.class)).thenReturn(mock(GraphQLDirectives.class));

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
        assertEquals("directive", directives[0].getName());
    }

}
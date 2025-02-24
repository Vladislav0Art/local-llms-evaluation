package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildDirectivesTest {

    @Test
    public void buildDirectivesTest() {
        // Arrange
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        GraphQLDirectives graphQLDirectives = mock(GraphQLDirectives.class);
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(graphQLDirectives);

        // Act
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        // Assert
        assertEquals(graphQLDirectives.length, 0);
    }

}
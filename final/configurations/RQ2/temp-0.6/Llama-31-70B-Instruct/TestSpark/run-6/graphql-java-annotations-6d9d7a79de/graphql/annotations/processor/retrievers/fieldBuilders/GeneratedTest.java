package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.schema.GraphQLDirective;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildNoDirectivesTest() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);

        // Act
        GraphQLDirective[] directives = directivesBuilder.build();

        // Assert
        assertNull(directives);
    }

    @Test
    public void buildWithDirectivesTest() {
        // Arrange
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        GraphQLDirectives graphQLDirectives = Mockito.mock(GraphQLDirectives.class);
        Mockito.when(annotatedElement.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(true);
        Mockito.when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(graphQLDirectives);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, null);

        // Act
        GraphQLDirective[] directives = directivesBuilder.build();

        // Assert
        assertNotNull(directives);
    }

}
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
public class GeneratedBuildNoDirectivesTest {

    @Test
    public void buildNoDirectivesTest() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);

        // Act
        GraphQLDirective[] directives = directivesBuilder.build();

        // Assert
        assertNull(directives);
    }

}
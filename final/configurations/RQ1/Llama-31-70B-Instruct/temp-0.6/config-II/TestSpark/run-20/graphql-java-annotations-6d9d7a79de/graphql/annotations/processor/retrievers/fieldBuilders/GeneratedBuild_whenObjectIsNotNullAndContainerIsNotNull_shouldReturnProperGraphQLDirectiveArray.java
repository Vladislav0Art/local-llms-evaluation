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

public class GeneratedBuild_whenObjectIsNotNullAndContainerIsNotNull_shouldReturnProperGraphQLDirectiveArray {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void build_whenObjectIsNotNullAndContainerIsNotNull_shouldReturnProperGraphQLDirectiveArray() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        Mockito.when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        Mockito.when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(null);

        // Act
        GraphQLDirective[] actualGraphQLDirectiveArray = directivesBuilder.build();

        // Assert
        assertArrayEquals(new GraphQLDirective[0], actualGraphQLDirectiveArray);
    }

}
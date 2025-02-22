package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testBuild_noDirectives_returnsEmptyArray() {
        // Arrange
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        when(annotatedElement.getAnnotationsByType(DirectiveJavaAnnotationUtil.getDirectiveAnnotation())).thenReturn(new Annotation[0]);
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        // Act
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertArrayEquals(new GraphQLDirective[0], result);
    }

}
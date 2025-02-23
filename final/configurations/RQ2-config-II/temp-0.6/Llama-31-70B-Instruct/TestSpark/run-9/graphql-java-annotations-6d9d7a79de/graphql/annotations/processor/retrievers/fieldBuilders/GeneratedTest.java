package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
    }

    @Test
    public void build_NoDirectives_ReturnsEmptyArray() {
        // Arrange
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement)).thenReturn(null);
        when(processingElementsContainer.getDirectiveRegistry()).thenReturn(null);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(0, result.length);
    }

}
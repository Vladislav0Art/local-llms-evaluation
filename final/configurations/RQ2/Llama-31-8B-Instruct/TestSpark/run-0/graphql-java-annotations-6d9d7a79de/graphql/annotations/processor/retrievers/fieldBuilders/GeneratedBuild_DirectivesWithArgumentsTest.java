package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_DirectivesWithArgumentsTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void build_DirectivesWithArgumentsTest() {
        // Arrange
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(GraphQLDirectives.class);
        GraphQLDirective directive = newDirective("directiveName").build();
        when(DirectiveJavaAnnotationUtil.getDirectives(annotatedElement)).thenReturn(new GraphQLDirective[]{directive});

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertArrayEquals(new GraphQLDirective[]{directive}, result);
    }

}
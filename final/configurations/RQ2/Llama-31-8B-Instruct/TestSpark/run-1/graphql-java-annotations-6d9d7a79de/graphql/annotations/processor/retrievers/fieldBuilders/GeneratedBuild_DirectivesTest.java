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
public class GeneratedBuild_DirectivesTest {

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void build_DirectivesTest() {
        // Arrange
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        GraphQLDirectives annotation = Mockito.mock(GraphQLDirectives.class);
        when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(annotation);

        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        when(container.getScalarTypes()).thenReturn(new ArrayList<>());
        when(container.getTypes()).thenReturn(new ArrayList<>());

        directivesBuilder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(1, result.length);
        assertEquals("GraphQLDirectives", result[0].getName());
    }

}
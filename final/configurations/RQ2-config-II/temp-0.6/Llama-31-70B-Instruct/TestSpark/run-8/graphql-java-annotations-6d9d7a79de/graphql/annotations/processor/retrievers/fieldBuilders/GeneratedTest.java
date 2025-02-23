package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
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

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement mockedObject;

    @Mock
    private ProcessingElementsContainer mockedContainer;

    @Before
    public void setUp() {
        directivesBuilder = new DirectivesBuilder(mockedObject, mockedContainer);
    }

    @Test
    public void build_noDirectives_returnsEmptyArray() {
        // Arrange
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockedObject)).thenReturn(new ArrayList<>());
        when(mockedObject.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(0, result.length);
    }

}
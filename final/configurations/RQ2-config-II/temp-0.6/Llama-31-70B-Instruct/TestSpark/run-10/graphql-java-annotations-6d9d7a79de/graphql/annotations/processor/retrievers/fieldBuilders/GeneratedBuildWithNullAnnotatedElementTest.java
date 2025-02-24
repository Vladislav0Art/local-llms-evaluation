package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithNullAnnotatedElementTest {

    @Mock
    private AnnotatedElement mockedAnnotatedElement;

    @Mock
    private ProcessingElementsContainer mockedContainer;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void buildWithNullAnnotatedElementTest() {
        when(mockedAnnotatedElement.getAnnotations()).thenReturn(null);
        GraphQLDirective[] result = directivesBuilder.build();
        assertNotNull(result);
        assertArrayEquals(new GraphQLDirective[0], result);
    }

}
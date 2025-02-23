package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.when;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedShouldThrowExceptionWhenNoDirectiveIsFound {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldThrowExceptionWhenNoDirectiveIsFound() throws GraphQLAnnotationsException {
        when(directiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(new ArrayList<>());
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        directivesBuilder.build();
    }

}
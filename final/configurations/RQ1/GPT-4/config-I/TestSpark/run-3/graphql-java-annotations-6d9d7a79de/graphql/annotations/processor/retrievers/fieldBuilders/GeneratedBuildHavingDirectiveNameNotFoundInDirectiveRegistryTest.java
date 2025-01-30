package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLScalarType.DirectiveContainer;
import graphql.schema.GraphQLScalarType.GraphQLArgumentContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildHavingDirectiveNameNotFoundInDirectiveRegistryTest {

    @Mock
    private ProcessingElementsContainer mockedContainer;
    @Mock
    private AnnotatedElement mockedAnnotatedElement;
    @Mock
    private GraphQLDirective mockedDirective;
    @Mock
    private GraphQLDirectives mockedAnnotation;

    @Test
    public void buildHavingDirectiveNameNotFoundInDirectiveRegistryTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockedAnnotatedElement, mockedContainer);

        when(mockedContainer.getDirectiveRegistry().containsKey(anyString())).thenReturn(false);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockedAnnotatedElement)).thenReturn(List.of(mockedAnnotation));
        when(DirectiveJavaAnnotationUtil.getName(mockedAnnotation)).thenReturn("invalidDirectiveName");

        directivesBuilder.build();
    }

}
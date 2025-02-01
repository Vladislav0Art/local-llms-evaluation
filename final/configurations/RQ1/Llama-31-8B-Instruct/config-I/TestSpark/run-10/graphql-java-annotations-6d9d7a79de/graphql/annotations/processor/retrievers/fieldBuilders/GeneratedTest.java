package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;

    @Mock
    private GraphQLDirectiveRegistry directiveRegistry;

    @Mock
    private GraphQLDirectives graphQLDirectives;

    @Mock
    private Annotation annotation;

    @Mock
    private GraphQLDirective graphQLDirective;

    @Mock
    private GraphQLArgument graphQLArgument;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Test
    public void build_BuildsDirectivesFromJavaAnnotations() {
        when(directiveJavaAnnotationUtil.getDirectiveAnnotations(any())).thenReturn(java.util.Arrays.asList(annotation));
        when(annotation.annotationType()).thenReturn(Annotation.class);
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        when(directiveRegistry.containsKey(any())).thenReturn(true);
        when(directiveRegistry.get(any())).thenReturn(graphQLDirective);
        when(graphQLDirective.getArguments()).thenReturn(java.util.Arrays.asList(graphQLArgument));
        when(graphQLArgument.getType()).thenReturn(GraphQLScalarType.class);
        when(graphQLArgument.getArgumentDefaultValue()).thenReturn(new GraphQLArgument.DefaultValue("defaultValue"));
        when(graphQLDirective.getName()).thenReturn("directiveName");

        GraphQLDirective[] result = directivesBuilder.build();

        assertEquals(1, result.length);
        assertEquals(graphQLDirective, result[0]);
    }

}
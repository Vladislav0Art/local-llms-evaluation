package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static graphql.schema.GraphQLDirective.newDirective;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTransformArgs_TooManyArguements_ExceptionThrown {

    @Mock
    AnnotatedElement object;

    @Mock
    ProcessingElementsContainer container;

    @Test
    public void transformArgs_TooManyArguements_ExceptionThrown() {
        Annotation annotation = Mockito.mock(Annotation.class);
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[4]);
        GraphQLDirective directive = newDirective().name("test").build();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            builder.transformArgs(directive, annotation);
            fail("Expected exception not thrown");
        } catch (GraphQLAnnotationsException e) {
            assertEquals("Directive 'test' is supplied with more argument values than it supports", e.getMessage());
        }
    }

}
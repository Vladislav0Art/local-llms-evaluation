package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.Coercing;
import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.activation.DirectiveArgument;
import graphql.annotations.annotationTypes.directives.activation.DirectiveLocation;
import graphql.annotations.annotationTypes.directives.activation.DirectiveLocations;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

public class GeneratedTransformArgsNotAScalarTypeTest {

    @Test
    public void transformArgsNotAScalarTypeTest() throws NoSuchMethodException {
        Method mockedElement = mock(Method.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockedElement, null);
        GraphQLDirective mockedDirective = mock(GraphQLDirective.class);
        Directive directiveAnnotation = mock(Directive.class);
        GraphQLArgument mockedArgument = mock(GraphQLArgument.class);
        when(mockedDirective.getArguments()).thenReturn(Arrays.asList(mockedArgument));
        when(mockedArgument.getType()).thenReturn(mock(Object.class));
        when(directiveAnnotation.getClass().getMethod("arguments")).thenReturn(mock(Method.class));

        builder.transformArgs(directiveAnnotation, mockedDirective);
    }

}
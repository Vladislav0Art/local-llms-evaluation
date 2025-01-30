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

public class GeneratedTransformArgsCantParseArgumentValueTest {

    @Test
    public void transformArgsCantParseArgumentValueTest() throws NoSuchMethodException {
        Method mockedElement = mock(Method.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockedElement, null);
        GraphQLDirective mockedDirective = mock(GraphQLDirective.class);
        Directive directiveAnnotation = mock(Directive.class);
        GraphQLArgument mockedArgument = mock(GraphQLArgument.class);
        GraphQLScalarType mockedType = mock(GraphQLScalarType.class);
        Coercing mockedCoerce = mock(Coercing.class);
        when(mockedDirective.getArguments()).thenReturn(Arrays.asList(mockedArgument));
        when(mockedArgument.getType()).thenReturn(mockedType);
        when(directiveAnnotation.arguments()).thenReturn(new DirectiveArgument[1]);
        when(mockedArgument.getType()).thenReturn(mockedType);
        when(mockedType.getCoercing()).thenReturn(mockedCoerce);
        when(mockedCoerce.parseValue(any())).thenThrow(new RuntimeException("Expected Test Exception"));

        builder.transformArgs(directiveAnnotation, mockedDirective);
    }

}
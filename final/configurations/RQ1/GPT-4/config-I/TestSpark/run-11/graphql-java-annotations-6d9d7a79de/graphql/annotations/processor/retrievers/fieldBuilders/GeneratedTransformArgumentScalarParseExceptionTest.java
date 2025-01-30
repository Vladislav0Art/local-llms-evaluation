package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedTransformArgumentScalarParseExceptionTest {

    @Test
    public void transformArgumentScalarParseExceptionTest() throws Exception {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        GraphQLArgument graphQLArgument = Mockito.mock(GraphQLArgument.class);
        GraphQLScalarType graphQLType = Mockito.mock(GraphQLScalarType.class);
        Method method = Mockito.mock(Method.class);
        Class<?> type = Mockito.mock(Class.class);

        Mockito.when(graphQLArgument.getType()).thenReturn(graphQLType);
        Mockito.when(annotation.annotationType()).thenReturn(type);
        Mockito.when(type.getDeclaredMethods()).thenReturn(new Method[]{method});
        Mockito.when(graphQLType.getCoercing().parseValue(Mockito.any())).thenThrow(new IllegalArgumentException());

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.transformArgument(annotation, newDirective(directive), List.of(graphQLArgument), 0);
    }

}
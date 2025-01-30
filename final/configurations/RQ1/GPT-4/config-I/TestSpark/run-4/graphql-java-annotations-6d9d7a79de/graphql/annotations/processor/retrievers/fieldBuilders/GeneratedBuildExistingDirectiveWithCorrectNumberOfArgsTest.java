package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static graphql.schema.GraphQLScalarType.newScalar;

public class GeneratedBuildExistingDirectiveWithCorrectNumberOfArgsTest {

    @Test
    public void buildExistingDirectiveWithCorrectNumberOfArgsTest() throws NoSuchMethodException {
        Method mockObject = Mockito.mock(Method.class);
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        Annotation[] annotations = new Annotation[]{Mockito.mock(Annotation.class)};
        Mockito.when(mockObject.getDeclaredAnnotations()).thenReturn(annotations);

        Map<String, GraphQLDirective> directiveRegistry = new HashMap<>();
        GraphQLDirective mockRegisteredDirective = Mockito.mock(GraphQLDirective.class);
        directiveRegistry.put("mock", mockRegisteredDirective);
        Mockito.when(mockContainer.getDirectiveRegistry()).thenReturn(directiveRegistry);

        GraphQLDirective mockGraphQlDirective = Mockito.mock(GraphQLDirective.class);

        GraphQLScalarType mockGraphQLScalarType = newScalar().coercing(new Coercing() {
            @Override
            public Object serialize(Object dataFetcherResult) {
                return null;
            }

            @Override
            public Object parseValue(Object input) {
                return null;
            }

            @Override
            public Object parseLiteral(Object input) {
                return null;
            }
        }).build();

        GraphQLArgument mockGraphQLArgument = GraphQLArgument.newArgument().type(mockGraphQLScalarType).build();
        Mockito.when(mockGraphQlDirective.getArguments()).thenReturn(Arrays.asList(mockGraphQLArgument));
        Mockito.when(mockRegisteredDirective.getArguments()).thenReturn(Arrays.asList(mockGraphQLArgument));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);

        GraphQLDirective[] result = builder.build();

        Assert.assertEquals(1, result.length);
        Assert.assertEquals(mockRegisteredDirective, result[0]);
    }

}
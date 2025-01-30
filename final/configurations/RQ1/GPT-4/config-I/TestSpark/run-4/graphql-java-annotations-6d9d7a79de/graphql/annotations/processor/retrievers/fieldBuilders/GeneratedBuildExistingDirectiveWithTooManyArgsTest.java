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

public class GeneratedBuildExistingDirectiveWithTooManyArgsTest {

    @Test
    public void buildExistingDirectiveWithTooManyArgsTest() {
        Method mockObject = Mockito.mock(Method.class);
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        Annotation[] annotations = new Annotation[]{Mockito.mock(Annotation.class)};
        Mockito.when(mockObject.getDeclaredAnnotations()).thenReturn(annotations);

        Map<String, GraphQLDirective> directiveRegistry = new HashMap<>();
        GraphQLDirective mockRegisteredDirective = Mockito.mock(GraphQLDirective.class);
        directiveRegistry.put("mock", mockRegisteredDirective);
        Mockito.when(mockContainer.getDirectiveRegistry()).thenReturn(directiveRegistry);

        GraphQLDirective mockGraphQlDirective = Mockito.mock(GraphQLDirective.class);
        Mockito.when(mockGraphQlDirective.getArguments()).thenReturn(Arrays.asList(Mockito.mock(GraphQLArgument.class)));
        Mockito.when(mockRegisteredDirective.getArguments()).thenReturn(Arrays.asList(Mockito.mock(GraphQLArgument.class)));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);

        builder.build();
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedTransformArgsArgumentsLessThanMethodsTest {

    @Test
    public void transformArgsArgumentsLessThanMethodsTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Method[] mockMethods = new Method[]{Mockito.mock(Method.class)};

        Mockito.when(mockAnnotation.annotationType().getDeclaredMethods()).thenReturn(mockMethods);

        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(Scalars.GraphQLString).build())
                .name("name")
                .build();

        GraphQLDirective result = builder.transformArgs(directive, mockAnnotation);

        Assert.assertEquals(result.getArguments().size(), mockMethods.length);
    }

}
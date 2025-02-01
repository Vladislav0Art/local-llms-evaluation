package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedTransformArgsArgumentAsScalarTypeTest {

    @Test
    public void transformArgsArgumentAsScalarTypeTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(Scalars.GraphQLString).build())
                .name("name")
                .build();

        GraphQLDirective result = builder.transformArgs(directive, new String[]{"test"});
        Assert.assertEquals(result.getArguments().size(), 1);
    }

}
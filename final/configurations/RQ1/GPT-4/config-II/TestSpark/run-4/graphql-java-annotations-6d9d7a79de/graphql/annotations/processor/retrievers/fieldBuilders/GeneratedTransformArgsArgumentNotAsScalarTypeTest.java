package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedTransformArgsArgumentNotAsScalarTypeTest {

    @Test
    public void transformArgsArgumentNotAsScalarTypeTest() {
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(Method.class), mockContainer);
        GraphQLDirective directive = GraphQLDirective.newDirective()
                .argument(GraphQLArgument.newArgument().name("arg1").type(new GraphQLObjectType("test", "test", new ArrayList<>())).build())
                .name("name")
                .build();
        builder.transformArgs(directive, new String[]{"test"});
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedBuildWithSingleDirectiveTest {

    @Test
    public void buildWithSingleDirectiveTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Method method = MyOtherDummyClass.class.getDeclaredMethods()[0];
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] result = builder.build();
        assertEquals(1, result.length);
    }

}
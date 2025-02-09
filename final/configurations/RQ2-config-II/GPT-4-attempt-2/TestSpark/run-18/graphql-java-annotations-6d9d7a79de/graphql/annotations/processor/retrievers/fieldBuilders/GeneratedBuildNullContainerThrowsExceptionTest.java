package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.lang.reflect.Method;

public class GeneratedBuildNullContainerThrowsExceptionTest {

    @Test
    public void buildNullContainerThrowsExceptionTest() {
        // Prepare
        final Method mockedMethod = Mockito.mock(Method.class);
        final DirectivesBuilder builder = new DirectivesBuilder(mockedMethod, null);

        // Execute
        builder.build();
    }

}
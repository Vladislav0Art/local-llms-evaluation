package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.lang.reflect.Method;

public class GeneratedBuildValidObjectTest {

    @Test
    public void buildValidObjectTest() {
        // Prepare
        final Method mockedMethod = Mockito.mock(Method.class);
        final ProcessingElementsContainer mockedContainer = Mockito.mock(ProcessingElementsContainer.class);
        final DirectivesBuilder builder = new DirectivesBuilder(mockedMethod, mockedContainer);

        // Execute
        final GraphQLDirective[] result = builder.build();

        // Verify
        Assert.assertNotNull("Result must not be null.", result);
    }

}
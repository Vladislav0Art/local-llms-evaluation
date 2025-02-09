package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.lang.reflect.Method;

public class GeneratedBuildInvalidObjectThrowsExceptionTest {

    @Test
    public void buildInvalidObjectThrowsExceptionTest() {
        // Prepare
        final ProcessingElementsContainer mockedContainer = Mockito.mock(ProcessingElementsContainer.class);
        final DirectivesBuilder builder = new DirectivesBuilder(null, mockedContainer);

        // Execute
        builder.build();
    }

}
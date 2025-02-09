package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNullContainerTest {

    @Test
    public void buildWithNullContainerTest() throws Exception {
        Field field = SampleClass.class.getDeclaredField("fieldWithDirectives");

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, null);

        try {
            GraphQLDirective[] directives = directivesBuilder.build();
            fail("Should have thrown an exception because container is null");
        } catch (NullPointerException e) {
            // Passed
        }
    }

}
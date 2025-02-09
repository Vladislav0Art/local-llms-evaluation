package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void constructorsTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(null, container);
        assertNotNull(builder);
    }

    @Test
    public void buildTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(null, container);

        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
        assertEquals(0, directives.length);
    }

    @Test
    public void buildTestWithException() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(String.class, container);

        builder.build();
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildValidScenarioTest {


    @Mock
    private ProcessingElementsContainer mockContainer;

    @Test
    public void buildValidScenarioTest() {
        Method mockMethod = mock(Method.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockMethod, mockContainer);

        GraphQLDirective[] result = builder.build();

        assertNotNull(result);
        assertEquals(0, result.length);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildDirectivesTest {

    @Test
    public void buildDirectivesTest() {
        AnnotatedElement mockObject = mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder testObject = new DirectivesBuilder(mockObject, mockContainer);
        GraphQLDirective[] actual = testObject.build();
        GraphQLDirective[] expected = new GraphQLDirective[]{};
        assertEquals(expected, actual);
    }

}
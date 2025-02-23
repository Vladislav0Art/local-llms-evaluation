package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        directivesBuilder = new DirectivesBuilder(mock(AnnotatedElement.class), mock(ProcessingElementsContainer.class));
    }

    @Test
    public void build_whenNoDirectives_shouldReturnEmptyArray() {
        // given

        // when
        GraphQLDirective[] result = directivesBuilder.build();

        // then
        assertEquals(0, result.length);
    }

}
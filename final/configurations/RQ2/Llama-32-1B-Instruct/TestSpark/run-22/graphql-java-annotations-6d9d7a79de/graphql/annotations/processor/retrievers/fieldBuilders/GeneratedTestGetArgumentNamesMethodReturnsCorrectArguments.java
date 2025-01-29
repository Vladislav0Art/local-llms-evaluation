package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetArgumentNamesMethodReturnsCorrectArguments {

    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;

    @BeforeEach
    public void setup() {
        mockObject = mockAny();
        mockContainer = mockAny();
    }

    @Test
    public void testGetArgumentNamesMethodReturnsCorrectArguments() throws Exception {
        directives().getArguments().add(new Argument("value", Arrays.asList(GraphQLDirective.Type.SINGLE)));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);
        Argument[] actualResult = directives().getArguments();

        assertTrue(actualResult.length == 1);

        for (Argument argument : actualResult) {
            assertEquals("value", argument.getName());
        }
    }

}
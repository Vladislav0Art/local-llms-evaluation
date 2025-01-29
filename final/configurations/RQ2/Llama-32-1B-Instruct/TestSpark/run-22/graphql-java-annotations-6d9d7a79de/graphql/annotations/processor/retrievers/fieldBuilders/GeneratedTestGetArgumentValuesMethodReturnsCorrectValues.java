package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetArgumentValuesMethodReturnsCorrectValues {

    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;

    @BeforeEach
    public void setup() {
        mockObject = mockAny();
        mockContainer = mockAny();
    }

    @Test
    public void testGetArgumentValuesMethodReturnsCorrectValues() throws Exception {
        directives().getArguments().add(new Argument("value1", Arrays.asList(GraphQLDirective.Type.SINGLE, GraphQLDirective.Type.INDIRECT)));
        directives().getArguments().add(new Argument("value2", Arrays.asList(GraphQLDirective.Type.SINGLE)));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);
        Argument[] actualResult = directives().getArgumentValues();

        assertTrue(actualResult.length == 2);

        for (int i = 0; i < actualResult.length; i++) {
            Argument argument = actualResult[i];
            assertTrue(argument.getValue() != null && !argument.getValue().isEmpty());
        }
    }

}
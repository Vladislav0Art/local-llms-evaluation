package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetFieldNamesMethodReturnsCorrectFields {

    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;

    @BeforeEach
    public void setup() {
        mockObject = mockAny();
        mockContainer = mockAny();
    }

    @Test
    public void testGetFieldNamesMethodReturnsCorrectFields() throws Exception {
        directives().getFields().add(new Field("field1", Arrays.asList(GraphQLDirective.Type.INDIRECT)));
        directives().getFields().add(new Field("field2", Arrays.asList(GraphQLDirective.Type.SINGLE)));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);
        Field[] actualResult = directives().getFields();

        assertTrue(actualResult.length == 2);

        for (int i = 0; i < actualResult.length; i++) {
            Field field = actualResult[i];
            assertEquals("field1", field.getName());
        }
    }

}
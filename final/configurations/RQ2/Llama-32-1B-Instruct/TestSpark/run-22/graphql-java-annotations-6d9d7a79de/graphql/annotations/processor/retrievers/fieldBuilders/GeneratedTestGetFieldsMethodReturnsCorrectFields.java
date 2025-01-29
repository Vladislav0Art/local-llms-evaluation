package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetFieldsMethodReturnsCorrectFields {

    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;

    @BeforeEach
    public void setup() {
        mockObject = mockAny();
        mockContainer = mockAny();
    }

    @Test
    public void testGetFieldsMethodReturnsCorrectFields() throws Exception {
        directives().getFields().add(new Field("field", Arrays.asList(GraphQLDirective.Type.INDIRECT)));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);
        Field[] actualResult = directives().getFields();

        assertTrue(actualResult.length == 1);

        for (Field field : actualResult) {
            assertEquals("field", field.getName());
        }
    }

    private Object[] mockAny() {
        // Mocking the object using JMockit
        return new Object[0];
    }

    private Type mockType() {
        // Mocking the type using JMockit
        return new Type();
    }

    private Field mockField() {
        // Mocking the field using JMockit
        return new Field();
    }

}
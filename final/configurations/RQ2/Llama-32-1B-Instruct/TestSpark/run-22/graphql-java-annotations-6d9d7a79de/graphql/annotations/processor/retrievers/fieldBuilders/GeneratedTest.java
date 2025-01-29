package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;

    @BeforeEach
    public void setup() {
        mockObject = mockAny();
        mockContainer = mockAny();
    }

    @Test
    public void testGetArgumentTypesMethodReturnsCorrectTypes() throws Exception {
        directives().getArguments().add(new Argument("value1", Arrays.asList(GraphQLDirective.Type.SINGLE, GraphQLDirective.Type.INDIRECT)));
        directives().getArguments().add(new Argument("value2", Arrays.asList(GraphQLDirective.Type.SINGLE)));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);
        List<GraphQLDirective> result = builder.getArgumentTypes();

        assertTrue(result.size() == 2);

        for (int i = 0; i < result.size(); i++) {
            GraphQLDirective directive = result.get(i);
            if (directive instanceof AnyType) {
                AnyType anyType = (AnyType) directive;
                assertTrue(anyType.getTypes().stream()
                        .allMatch(t -> t.isDirectives()));
            } else {
                assertEquals(1, anyType.getTypes().size());
                assertTrue(anyType.getTypes().stream().allMatch(t -> t.isDirectives()));
            }
        }
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

    @Test
    public void testGetTypesMethodReturnsCorrectTypes() throws Exception {
        directives().getTypes().add(new Type(GraphQLDirective.Type.SINGLE));
        directives().getTypes().add(new Type(GraphQLDirective.Type.INDIRECT));

        DirectivesBuilder builder = new DirectivesBuilder(mockObject, mockContainer);
        List<GraphQLDirective> result = builder.getTypes();

        assertTrue(result.size() == 2);

        for (int i = 0; i < result.size(); i++) {
            GraphQLDirective directive = result.get(i);
            if (directive instanceof AnyType) {
                AnyType anyType = (AnyType) directive;
                assertEquals(1, anyType.getTypes().size());
                assertTrue(anyType.getTypes().stream()
                        .allMatch(t -> t.isDirectives()));
            } else {
                assertEquals(1, directive.getTypes().size());
                assertTrue(directive.getTypes().stream().allMatch(t -> t.isDirectives()));
            }
        }
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
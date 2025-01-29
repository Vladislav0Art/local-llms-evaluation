package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetArgumentTypesMethodReturnsCorrectTypes {

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

}
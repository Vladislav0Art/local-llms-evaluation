package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetTypesMethodReturnsCorrectTypes {

    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;

    @BeforeEach
    public void setup() {
        mockObject = mockAny();
        mockContainer = mockAny();
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

}
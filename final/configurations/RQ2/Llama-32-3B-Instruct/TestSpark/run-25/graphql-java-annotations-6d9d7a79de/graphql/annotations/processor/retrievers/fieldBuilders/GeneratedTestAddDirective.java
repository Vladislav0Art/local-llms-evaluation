package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestAddDirective {

    public void build() {
    }
}

public class ProcessingElementsContainer {
    public List<Object> getProcessingElements() {
        return new ArrayList<>();
    }
}

public interface AnnotatedElement {
}

public class MockType implements AnnotatedElement.Type {
}

public class GeneratedTest {

    @Mock
    private DirectivesBuilder directivesBuilder;

    @Test
    public void testAddDirective() {
        GraphQLDirectives graphqlDirectives = new GraphQLDirectives();
        graphqlDirectives.add("directiveName");

        verify(directivesBuilder, Times::times (1)).build();
    }

}
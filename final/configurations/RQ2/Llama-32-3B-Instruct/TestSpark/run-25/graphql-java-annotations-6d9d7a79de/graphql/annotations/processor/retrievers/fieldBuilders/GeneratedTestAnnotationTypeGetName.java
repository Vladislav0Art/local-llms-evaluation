package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestAnnotationTypeGetName {

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
    public void testAnnotationTypeGetName() {
        AnnotatedElement annotation = mock(AnnotatedElement.class);

        when(annotation.annotationType()).thenReturn(MockType.class);

        String name = ((AnnotatedElement.Type) annotation.annotationType()).getName();
    }
}

public class GraphQLDirectives {
    private final List<String> directives = new ArrayList<>();

    public void add(String directiveName) {
        this.directives.add(directiveName);
    }

    public List<String> getDirectives() {
        return directives;
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGetProcessingElements {

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
    public void testGetProcessingElements() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        when(container.getProcessingElements()).thenReturn(new ArrayList<>());

        verifyNoMoreInteractions(container);
    }

}
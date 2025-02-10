package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestProcessingElementsContainer {

    private List<String> directives;

    public ProcessingElementsContainer() {
        this.directives = new ArrayList<>();
    }

    public void addDirective(String directive) {
        this.directives.add(directive);
    }

    public List<String> getDirectives() {
        return directives;
    }
}

public class AnnotatedElementTest {

    @Test
    public void testProcessingElementsContainer() {
        ProcessingElementsContainer processingElementsContainer = new ProcessingElementsContainer();
        processingElementsContainer.addDirective("directive1");
        processingElementsContainer.addDirective("directive2");

        List<String> directives = processingElementsContainer.getDirectives();

        assertEquals(2, directives.size());
        assertTrue(directives.contains("directive1"));
        assertTrue(directives.contains("directive2"));
    }
}

}
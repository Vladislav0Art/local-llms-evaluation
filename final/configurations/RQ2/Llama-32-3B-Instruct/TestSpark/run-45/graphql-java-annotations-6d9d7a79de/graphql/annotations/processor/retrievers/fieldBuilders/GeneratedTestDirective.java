package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirective {

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
    public void testDirective() {
        String directive = "testDirective";

        assertNotNull(directive);
        assertFalse(directive.isEmpty());

        assertEquals(10, directive.length());
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedDirectivesBuilder_isInstantiableWithObjectAndContainer {

    @Test
    public void DirectivesBuilder_isInstantiableWithObjectAndContainer() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        try {
            new DirectivesBuilder(object, container);
            assertEquals(0, fail("Expected NullPointerException"));
        } catch (NullPointerException e) {
        }
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedNewDirectivesBuilderCreationFailureTest {

    @Test
    public void newDirectivesBuilderCreationFailureTest() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        try {
            DirectivesBuilder.newDirectivesBuilder(object, container);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}
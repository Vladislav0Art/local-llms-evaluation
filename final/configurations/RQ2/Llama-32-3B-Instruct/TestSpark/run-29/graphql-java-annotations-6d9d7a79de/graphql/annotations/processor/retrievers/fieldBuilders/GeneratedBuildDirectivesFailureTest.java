package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesFailureTest {

    @Test
    public void buildDirectivesFailureTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        try {
            DirectivesBuilder.newDirectivesBuilder(object, container).build();
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

}
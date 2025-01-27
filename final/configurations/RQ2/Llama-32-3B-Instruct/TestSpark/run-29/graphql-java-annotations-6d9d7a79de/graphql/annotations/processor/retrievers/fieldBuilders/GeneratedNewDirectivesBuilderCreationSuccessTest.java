package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedNewDirectivesBuilderCreationSuccessTest {

    @Test
    public void newDirectivesBuilderCreationSuccessTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Assert.assertTrue(DirectivesBuilder.newDirectivesBuilder(object, container) instanceof DirectivesBuilder);
    }

}
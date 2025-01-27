package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedNewDirectivesBuilder_withObject_andContainer_returnsNewInstance {

    @Test
    public void newDirectivesBuilder_withObject_andContainer_returnsNewInstance() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        assert builder != null;
    }

}
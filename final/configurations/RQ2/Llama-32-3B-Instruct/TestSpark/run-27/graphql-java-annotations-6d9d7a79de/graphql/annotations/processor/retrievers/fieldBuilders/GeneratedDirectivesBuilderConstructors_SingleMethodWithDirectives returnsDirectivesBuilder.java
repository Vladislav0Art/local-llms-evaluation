package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedDirectivesBuilderConstructors_SingleMethodWithDirectives returnsDirectivesBuilder {

    @Test
    public void DirectivesBuilderConstructors_SingleMethodWithDirectives

    returnsDirectivesBuilder() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);

        verify(builder).build();
    }

}
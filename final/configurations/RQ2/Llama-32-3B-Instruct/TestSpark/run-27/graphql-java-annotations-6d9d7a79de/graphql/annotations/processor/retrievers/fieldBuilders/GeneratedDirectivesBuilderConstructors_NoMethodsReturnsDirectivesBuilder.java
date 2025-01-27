package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedDirectivesBuilderConstructors_NoMethodsReturnsDirectivesBuilder {

    @Test
    public void DirectivesBuilderConstructors_NoMethodsReturnsDirectivesBuilder() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);

        verifyNoMethodCalls(builder);
    }

}
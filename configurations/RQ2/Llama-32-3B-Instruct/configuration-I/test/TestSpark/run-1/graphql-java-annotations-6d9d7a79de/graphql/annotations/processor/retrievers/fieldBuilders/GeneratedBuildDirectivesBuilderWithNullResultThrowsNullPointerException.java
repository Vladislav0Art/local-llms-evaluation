package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesBuilderWithNullResultThrowsNullPointerException {

    @Test
    public void buildDirectivesBuilderWithNullResultThrowsNullPointerException() {
        // Arrange and Act and Assert
        assertThrows(NullPointerException.class, () -> new DirectivesBuilder(new AnnotatedElement(), new ProcessingElementsContainer()).build());
    }

}
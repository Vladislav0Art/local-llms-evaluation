package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderInitializedWithNullElementThrowsNullPointerException {

    @Test
    public void builderInitializedWithNullElementThrowsNullPointerException() {
        // Arrange and Act and Assert
        assertThrows(NullPointerException.class, () -> new DirectivesBuilder(null, new ProcessingElementsContainer()));
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedGivenDirectivesBuilderWithMissingDirectiveRegistryThenThrowsError {

    @Test
    public void givenDirectivesBuilderWithMissingDirectiveRegistryThenThrowsError() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        when(container.getDirectiveRegistry()).thenReturn(Collections.emptyMap());

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act and Assert
        assertThrows(GraphQLAnnotationsException.class, () -> builder.build());
    }

}
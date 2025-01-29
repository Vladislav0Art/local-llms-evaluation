package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_AddsExistingDirectivesWhenAddedWithExistingDirectives {

    @Test
    public void testBuild_AddsExistingDirectivesWhenAddedWithExistingDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertEquals(1, Arrays.stream(result).filter(d -> d != null && !d.getName().isEmpty()).count());
    }

}
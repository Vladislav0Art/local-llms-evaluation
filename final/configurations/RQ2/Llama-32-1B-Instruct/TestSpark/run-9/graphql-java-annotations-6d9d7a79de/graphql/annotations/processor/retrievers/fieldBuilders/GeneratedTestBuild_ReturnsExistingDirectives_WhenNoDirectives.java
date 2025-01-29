package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_ReturnsExistingDirectives_WhenNoDirectives {

    @Test
    public void testBuild_ReturnsExistingDirectives_WhenNoDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertEquals(0, Arrays.stream(result).filter(d -> d != null && !d.getName().isEmpty()).count());
    }

}
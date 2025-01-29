package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_ReturnsEmptyArray_WhenNoDirectives {

    @Test
    public void testBuild_ReturnsEmptyArray_WhenNoDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertArrayNotContains(result, GraphQLDirectives.values());
    }

}
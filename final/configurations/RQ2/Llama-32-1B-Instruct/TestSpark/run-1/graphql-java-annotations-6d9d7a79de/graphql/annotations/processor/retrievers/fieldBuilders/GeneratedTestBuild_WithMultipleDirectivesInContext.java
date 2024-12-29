package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_WithMultipleDirectivesInContext {

    @Test
    public void testBuild_WithMultipleDirectivesInContext() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(2, result.length);
    }

}
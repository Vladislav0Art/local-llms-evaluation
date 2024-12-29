package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_WithDirectives {

    @Test
    public void testBuild_WithDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(1, result.length);
    }

}
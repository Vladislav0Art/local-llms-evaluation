package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_WithDefaultTypes {

    @Test
    public void testBuild_WithDefaultTypes() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(5, result.length);
    }

}
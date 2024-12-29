package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_WithoutDirectives {

    @Test
    public void testBuild_WithoutDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(0, result.length);
    }

}
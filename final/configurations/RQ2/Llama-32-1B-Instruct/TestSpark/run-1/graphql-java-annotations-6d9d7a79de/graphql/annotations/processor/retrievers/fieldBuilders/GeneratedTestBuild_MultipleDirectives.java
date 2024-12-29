package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_MultipleDirectives {

    @Test
    public void testBuild_MultipleDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(3, result.length);
    }

}
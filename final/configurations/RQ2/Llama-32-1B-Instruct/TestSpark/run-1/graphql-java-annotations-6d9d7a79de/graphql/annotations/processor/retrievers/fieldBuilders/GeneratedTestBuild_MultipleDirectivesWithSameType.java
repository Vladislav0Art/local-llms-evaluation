package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_MultipleDirectivesWithSameType {

    @Test
    public void testBuild_MultipleDirectivesWithSameType() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(1, result.length);
    }

}
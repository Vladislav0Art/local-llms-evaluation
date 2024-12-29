package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_UsesDirectivesBuilderConstructors {

    @Test
    public void testBuild_UsesDirectivesBuilderConstructors() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;

        // Act
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();

        // Assert
        assertEquals(0, result.length);
    }

}
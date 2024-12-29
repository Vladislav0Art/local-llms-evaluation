package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_InvalidDirectives {

    @Test
    public void testBuild_InvalidDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;

        // Act and Assert
        assertThrows(GraphQLAnnotationsException.class, () -> new DirectivesBuilder(object, container).build());
    }

}
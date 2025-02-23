package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_objectWithNoDirectives_returnsEmptyArray {

    @Test
    public void build_objectWithNoDirectives_returnsEmptyArray() {
        // Arrange
        AnnotatedElement object = new ObjectWithNoDirectives();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(0, directives.length);
    }

}
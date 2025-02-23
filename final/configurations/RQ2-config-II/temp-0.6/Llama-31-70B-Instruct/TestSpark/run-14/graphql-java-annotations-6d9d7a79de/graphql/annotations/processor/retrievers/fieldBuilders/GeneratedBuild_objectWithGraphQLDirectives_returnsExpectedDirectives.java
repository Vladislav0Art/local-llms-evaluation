package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_objectWithGraphQLDirectives_returnsExpectedDirectives {

    @Test
    public void build_objectWithGraphQLDirectives_returnsExpectedDirectives() {
        // Arrange
        AnnotatedElement object = new ObjectWithGraphQLDirectives();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
        assertEquals("directive2", directives[0].getName());
    }

}
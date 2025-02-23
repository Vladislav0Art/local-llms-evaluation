package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_objectWithDirectiveAnnotations_returnsExpectedDirectives {

    @Test
    public void build_objectWithDirectiveAnnotations_returnsExpectedDirectives() {
        // Arrange
        AnnotatedElement object = new ObjectWithDirectiveAnnotations();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
        assertEquals("directive1", directives[0].getName());
    }

}
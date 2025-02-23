package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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
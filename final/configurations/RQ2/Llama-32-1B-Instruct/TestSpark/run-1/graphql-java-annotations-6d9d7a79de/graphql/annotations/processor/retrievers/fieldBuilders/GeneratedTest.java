package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void testBuild_InvalidDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;

        // Act and Assert
        assertThrows(GraphQLAnnotationsException.class, () -> new DirectivesBuilder(object, container).build());
    }

    @Test
    public void testBuild_MultipleDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(3, result.length);
    }

    @Test
    public void testBuild_MultipleDirectivesWithSameName() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(1, result.length);
    }

    @Test
    public void testBuild_MultipleDirectivesWithSameType() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(1, result.length);
    }

    @Test
    public void testBuild_WithDefaultTypes() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(5, result.length);
    }

    @Test
    public void testBuild_WithDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(1, result.length);
    }

    @Test
    public void testBuild_WithoutDirectives() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(0, result.length);
    }

    @Test
    public void testBuild_WithMultipleDirectivesInContext() {
        // Arrange
        AnnotatedElement object = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act and Assert
        GraphQLDirective[] result = new DirectivesBuilder(object, container).build();
        assertEquals(2, result.length);
    }

}
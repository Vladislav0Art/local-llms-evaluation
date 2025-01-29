package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void testBuildWithValidGraphQLArgument() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective[] directives = mock(GraphQLDirective[].class);

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(object, container);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

    @Test
    public void testBuildWithInvalidGraphQLArgument() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective[] directives = new GraphQLDirective[0];

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(object, container);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

    @Test
    public void testBuildWithInvalidDirectiveType() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective[] directives = new GraphQLDirective[0];

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(object, container);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

    @Test
    public void testBuildWithInvalidDirectiveName() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective[] directives = new GraphQLDirective[0];

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(object, container);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

    @Test
    public void testBuildWithNullArgument() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective[] directives = new GraphQLDirective[0];

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(object, container);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

    @Test
    public void testBuildWithNullContainer() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        GraphQLDirective[] directives = new GraphQLDirective[0];

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(object, null);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

    @Test
    public void testBuildWithNullElement() {
        // Arrange
        Object[] objectArray = new Object[0];
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective[] directives = new GraphQLDirective[0];

        DirectivesBuilderDirectives directivesBuilder = new DirectivesBuilderDirectives(objectArray, container);

        // Act
        DirectivesBuilder build = directivesBuilder.build();

        // Assert
        assertEquals(directives, build.get());
    }

}

class DirectivesBuilderDirectives {
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    public DirectivesBuilderDirectives(AnnotatedElement object, ProcessingElementsContainer container) {
        this.object = object;
        this.container = container;
    }

    @Override
    public GraphQLDirective[] build() {
        // implementation
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithNullElement {

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
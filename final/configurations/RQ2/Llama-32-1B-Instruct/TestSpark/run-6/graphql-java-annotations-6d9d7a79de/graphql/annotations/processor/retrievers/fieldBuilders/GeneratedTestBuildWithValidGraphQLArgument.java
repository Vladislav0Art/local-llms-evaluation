package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithValidGraphQLArgument {

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

}
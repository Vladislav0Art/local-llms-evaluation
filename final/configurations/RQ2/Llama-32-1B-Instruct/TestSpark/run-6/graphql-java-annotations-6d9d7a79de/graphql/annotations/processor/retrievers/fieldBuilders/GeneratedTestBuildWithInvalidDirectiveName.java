package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithInvalidDirectiveName {

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

}
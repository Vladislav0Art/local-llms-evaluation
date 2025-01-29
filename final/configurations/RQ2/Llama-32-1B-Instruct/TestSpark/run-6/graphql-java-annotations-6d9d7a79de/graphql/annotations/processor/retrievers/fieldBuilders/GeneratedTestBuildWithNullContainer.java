package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithNullContainer {

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

}
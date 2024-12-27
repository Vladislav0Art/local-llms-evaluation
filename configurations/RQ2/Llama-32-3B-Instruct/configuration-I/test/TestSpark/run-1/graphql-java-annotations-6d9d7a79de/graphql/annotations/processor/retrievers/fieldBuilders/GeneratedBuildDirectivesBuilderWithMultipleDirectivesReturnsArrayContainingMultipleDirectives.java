package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesBuilderWithMultipleDirectivesReturnsArrayContainingMultipleDirectives {

    @Test
    public void buildDirectivesBuilderWithMultipleDirectivesReturnsArrayContainingMultipleDirectives() {
        // Arrange and Act
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(new AnnotatedElement(), new ProcessingElementsContainer());
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(2, result.length);
    }

}
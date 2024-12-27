package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesBuilderWithEmptyListReturnsEmptyArray {

    @Test
    public void buildDirectivesBuilderWithEmptyListReturnsEmptyArray() {
        // Arrange and Act
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(new AnnotatedElement(), new ProcessingElementsContainer());
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(0, result.length);
    }

}
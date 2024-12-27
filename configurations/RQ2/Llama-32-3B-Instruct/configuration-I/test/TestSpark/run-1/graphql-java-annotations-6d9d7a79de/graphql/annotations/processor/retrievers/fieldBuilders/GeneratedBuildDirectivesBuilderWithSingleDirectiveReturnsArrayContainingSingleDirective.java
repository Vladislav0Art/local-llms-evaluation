package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesBuilderWithSingleDirectiveReturnsArrayContainingSingleDirective {

    @Test
    public void buildDirectivesBuilderWithSingleDirectiveReturnsArrayContainingSingleDirective() {
        // Arrange and Act
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(new AnnotatedElement(), new ProcessingElementsContainer());
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(1, result.length);
    }

}
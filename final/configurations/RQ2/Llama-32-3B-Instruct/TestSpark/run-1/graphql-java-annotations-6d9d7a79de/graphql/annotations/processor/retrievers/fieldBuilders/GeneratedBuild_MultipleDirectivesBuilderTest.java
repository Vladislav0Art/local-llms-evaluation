package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_MultipleDirectivesBuilderTest {

    @Test
    public void build_MultipleDirectivesBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(2, directives.length);
    }

}
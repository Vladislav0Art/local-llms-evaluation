package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_MultipleArgumentsDirectivesBuilderTest {

    @Test
    public void build_MultipleArgumentsDirectivesBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(4, directives.length);
    }

}
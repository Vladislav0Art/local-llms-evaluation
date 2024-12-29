package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_MultipleDirectivesAndArgumentsBuilderTest {

    @Test
    public void build_MultipleDirectivesAndArgumentsBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(3, directives.length);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_SingleDirectiveBuilderTest {

    @Test
    public void build_SingleDirectiveBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
    }

}
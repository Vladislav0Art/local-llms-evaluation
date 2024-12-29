package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedConstructor_SingleDirectiveBuilderTest {

    @Test
    public void constructor_SingleDirectiveBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Assert
        assertEquals(1, builder.getDirectives().size());
    }

}
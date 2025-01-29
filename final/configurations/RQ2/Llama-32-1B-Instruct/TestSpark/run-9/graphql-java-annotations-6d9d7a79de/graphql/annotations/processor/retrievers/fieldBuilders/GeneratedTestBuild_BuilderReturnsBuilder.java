package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_BuilderReturnsBuilder {

    @Test
    public void testBuild_BuilderReturnsBuilder() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        DirectivesBuilder result = (DirectivesBuilder) builder.build();

        // Assert
        assertEquals(builder, result);
    }

}
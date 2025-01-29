package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild_InvalidDirectives {

    @Test
    public void testBuild_InvalidDirectives() throws Exception, MockitoException {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertNotNull(result);
    }

}
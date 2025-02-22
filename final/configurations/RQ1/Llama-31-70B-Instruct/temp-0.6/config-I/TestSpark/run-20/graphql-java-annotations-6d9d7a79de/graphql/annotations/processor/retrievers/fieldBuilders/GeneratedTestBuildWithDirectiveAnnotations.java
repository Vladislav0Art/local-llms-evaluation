package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithDirectiveAnnotations {

    @Test
    public void testBuildWithDirectiveAnnotations() {
        // Arrange
        Method method = Arrays.stream(this.getClass().getDeclaredMethods())
                .filter(m -> m.getName().equals("annotatedMethod"))
                .findFirst().get();

        DirectivesBuilder builder = new DirectivesBuilder(method, mock(ProcessingElementsContainer.class));

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
        assertEquals("annotationDirective", directives[0].getName());
    }

}
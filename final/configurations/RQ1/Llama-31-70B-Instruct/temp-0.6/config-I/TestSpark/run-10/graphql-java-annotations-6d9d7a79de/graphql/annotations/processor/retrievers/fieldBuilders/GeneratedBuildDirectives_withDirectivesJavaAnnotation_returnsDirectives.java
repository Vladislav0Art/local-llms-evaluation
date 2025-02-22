package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectives_withDirectivesJavaAnnotation_returnsDirectives {

    @Test
    public void buildDirectives_withDirectivesJavaAnnotation_returnsDirectives() {
        // Arrange
        AnnotatedElement mockAnnotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer mockProcessingElementsContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockAnnotatedElement, mockProcessingElementsContainer);
        GraphQLDirective mockGraphQLDirective = mock(GraphQLDirective.class);
        Builder mockBuilder = mock(Builder.class);
        when(mockGraphQLDirective.transform(mockBuilder))
                .thenReturn(mockGraphQLDirective);
        when(mockProcessingElementsContainer.getDirectiveRegistry().containsKey("directiveName"))
                .thenReturn(true);
        when(mockProcessingElementsContainer.getDirectiveRegistry().get("directiveName").getDirective())
                .thenReturn(mockGraphQLDirective);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertNotNull(directives);
        assertEquals(1, directives.length);
        assertEquals(mockGraphQLDirective, directives[0]);
    }

}
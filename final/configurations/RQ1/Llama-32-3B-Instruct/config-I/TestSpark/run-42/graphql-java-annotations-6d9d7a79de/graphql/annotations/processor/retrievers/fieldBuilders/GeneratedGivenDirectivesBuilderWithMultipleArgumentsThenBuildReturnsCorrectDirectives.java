package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedGivenDirectivesBuilderWithMultipleArgumentsThenBuildReturnsCorrectDirectives {

    @Test
    public void givenDirectivesBuilderWithMultipleArgumentsThenBuildReturnsCorrectDirectives() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        List<GraphQLDirective> graphQLDirectives = Arrays.asList(new GraphQLDirective());

        when(container.getDirectiveRegistry()).thenReturn(Collections.singletonMap("test", new Directive()));
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(new Annotation()));

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        List<GraphQLDirective> result = builder.build();

        // Assert
        assertEquals(1, result.size());
        assertEquals("test", result.get(0).getName());
    }

}
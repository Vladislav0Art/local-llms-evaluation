package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedGivenDirectivesBuilderWithInvalidArgumentTypeThenThrowsError {

    @Test
    public void givenDirectivesBuilderWithInvalidArgumentTypeThenThrowsError() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        List<GraphQLDirective> graphQLDirectives = Arrays.asList(new GraphQLDirective());

        when(container.getDirectiveRegistry()).thenReturn(Collections.singletonMap("test", new Directive()));
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(new Annotation()));

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act and Assert
        assertThrows(GraphQLAnnotationsException.class, () -> builder.build());
    }

}
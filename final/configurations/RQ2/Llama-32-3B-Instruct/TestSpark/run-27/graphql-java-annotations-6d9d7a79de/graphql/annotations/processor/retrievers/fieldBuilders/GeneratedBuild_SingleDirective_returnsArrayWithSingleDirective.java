package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_SingleDirective_returnsArrayWithSingleDirective {

    @Test
    public void build_SingleDirective_returnsArrayWithSingleDirective() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        GraphQLDirective directive = mock(GraphQLDirective.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(directive);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(1, directives.length);
        assertEquals(directive, directives[0]);
    }

}
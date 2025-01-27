package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_NoDirectives_returnsEmptyArray {

    @Test
    public void build_NoDirectives_returnsEmptyArray() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(0, directives.length);
    }

}
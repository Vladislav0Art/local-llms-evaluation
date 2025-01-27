package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_MultipleDirectives_DirectedByArgument returnsArrayWithMultipleDirectives {

    @Test
    public void build_MultipleDirectives_DirectedByArgument

    returnsArrayWithMultipleDirectives() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective directive1 = mock(GraphQLDirective.class);
        GraphQLDirective directive2 = mock(GraphQLDirective.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(directive1);
        when(element.getClass().getDeclaredMethod("getArgument")).thenReturn(new Object[]{directive2});

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(2, directives.length);
        assertTrue(directories[0] == directive1 || directories[0] == directive2);
        assertTrue(directories[1] == directive1 || directories[1] == directive2);
    }

}
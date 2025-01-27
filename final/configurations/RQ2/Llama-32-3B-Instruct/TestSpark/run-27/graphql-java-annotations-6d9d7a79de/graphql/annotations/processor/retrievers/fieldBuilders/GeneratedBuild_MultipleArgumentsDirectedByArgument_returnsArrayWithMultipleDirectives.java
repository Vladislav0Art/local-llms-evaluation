package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_MultipleArgumentsDirectedByArgument_returnsArrayWithMultipleDirectives {

    @Test
    public void build_MultipleArgumentsDirectedByArgument_returnsArrayWithMultipleDirectives() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective directive1 = mock(GraphQLDirective.class);
        GraphQLDirective directive2 = mock(GraphQLDirective.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(Arrays.asList(directive1, directive2));
        when(element.getClass().getDeclaredMethod("getArgument")).thenReturn(new Object[]{directive2});

        builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(2, directives.length);
        assertTrue(directories[0] == directive1 || directories[0] == directive2);
        assertTrue(directories[1] == directive1 || directories[1] == directive2);
    }

}
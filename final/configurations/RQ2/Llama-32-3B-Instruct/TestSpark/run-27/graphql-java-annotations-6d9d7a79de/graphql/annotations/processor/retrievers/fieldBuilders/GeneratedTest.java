package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void DirectivesBuilderConstructors_SingleMethodWithDirectives

    returnsDirectivesBuilder() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);

        verify(builder).build();
    }

    @Test
    public void DirectivesBuilderConstructors_NoMethodsReturnsDirectivesBuilder() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);

        verifyNoMethodCalls(builder);
    }

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

    @Test
    public void build_NoDirectives_returnsEmptyArray() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(0, directives.length);
    }

    @Test
    public void build_MultipleDirectives_returnsArrayWithMultipleDirectives() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective directive1 = mock(GraphQLDirective.class);
        GraphQLDirective directive2 = mock(GraphQLDirective.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(Arrays.asList(directive1, directive2));

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(2, directives.length);
        assertTrue(directories[0] == directive1 || directories[0] == directive2);
        assertTrue(directories[1] == directive1 || directories[1] == directive2);
    }

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

    @Test
    public void build_NoArguments_returnsArrayWithSingleDirective() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective directive = mock(GraphQLDirective.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(directive);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(1, directives.length);
        assertEquals(directive, directives[0]);
    }

    @Test
    public void build_NoArgumentsNoDirectives_returnsEmptyArray() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(0, directives.length);
    }

    @Test
    public void build_MultipleArguments_returnsArrayWithMultipleDirectives() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLArgument argument1 = mock(GraphQLArgument.class);
        GraphQLDirective directive1 = mock(GraphQLDirective.class);
        GraphQLArgument argument2 = mock(GraphQLArgument.class);
        GraphQLDirective directive2 = mock(GraphQLDirective.class);

        when(element.getAnnotation(GraphQLDirectives.class)).thenReturn(Arrays.asList(directive1, directive2));
        when(argument1.getType()).thenReturn(directive1);

        builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] directives = builder.build();

        assertEquals(2, directives.length);
        assertTrue(directories[0] == directive1 || directories[0] == directive2);
        assertTrue(directories[1] == directive1 || directories[1] == directive2);
    }

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
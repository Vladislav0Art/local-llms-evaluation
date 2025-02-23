package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        // Arrange
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective[] directives = new GraphQLDirective[1];
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);

        when(container.getDirectiveRegistry()).thenReturn(directive);
        when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(directive);
        when(directive.getArguments()).thenReturn(new GraphQLArgument[0]);
        when(directive.getArgumentDefaultValue()).thenReturn(directive);

        // Act
        GraphQLDirectivesBuilder builder = new GraphQLDirectivesBuilder(object, container);
        GraphQLDirective[] actual = builder.build();

        // Assert
        assertNotNull(actual);
        assertEquals(directives.length, actual.length);
    }

}
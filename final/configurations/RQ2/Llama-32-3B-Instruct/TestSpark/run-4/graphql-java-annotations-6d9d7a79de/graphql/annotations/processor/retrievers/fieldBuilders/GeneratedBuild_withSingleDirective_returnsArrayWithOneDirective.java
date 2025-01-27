package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withSingleDirective_returnsArrayWithOneDirective {

    @Test
    public void build_withSingleDirective_returnsArrayWithOneDirective() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective directive = mock(GraphQLDirective.class);
        when(directive.getName()).thenReturn("testDirective");
        List<GraphQLDirective> directives = Arrays.asList(directive);
        GraphQLDirective[] result = builder.build();
        assert result.length == 1;
        assert result[0] == directive;
    }

}
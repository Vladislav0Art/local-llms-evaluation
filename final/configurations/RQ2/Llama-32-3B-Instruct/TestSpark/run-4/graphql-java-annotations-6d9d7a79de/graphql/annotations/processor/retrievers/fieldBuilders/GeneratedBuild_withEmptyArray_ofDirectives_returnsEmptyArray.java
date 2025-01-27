package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withEmptyArray_ofDirectives_returnsEmptyArray {

    @Test
    public void build_withEmptyArray_ofDirectives_returnsEmptyArray() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directives = Arrays.asList();
        GraphQLDirective[] result = builder.build();
        assert result == directives.toArray(new GraphQLDirective[0]);
    }

}
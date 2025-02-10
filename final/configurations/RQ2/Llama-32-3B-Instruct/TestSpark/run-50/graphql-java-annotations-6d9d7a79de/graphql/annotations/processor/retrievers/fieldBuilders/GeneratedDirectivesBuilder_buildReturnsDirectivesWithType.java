package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedDirectivesBuilder_buildReturnsDirectivesWithType {

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithType() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).mapType(GraphQLDirective.class).collect(Collectors.toList()));
    }

}
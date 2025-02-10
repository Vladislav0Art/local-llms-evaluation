package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedDirectivesBuilder_buildReturnsDirectivesWithArguments {

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithArguments() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list with arguments
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).mapArguments(GraphQLDirective.class).collect(Collectors.toList()));
    }

}
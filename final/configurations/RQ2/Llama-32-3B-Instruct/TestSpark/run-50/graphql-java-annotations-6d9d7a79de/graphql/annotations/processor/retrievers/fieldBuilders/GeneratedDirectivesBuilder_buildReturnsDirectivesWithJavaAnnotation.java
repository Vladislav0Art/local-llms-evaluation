package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedDirectivesBuilder_buildReturnsDirectivesWithJavaAnnotation {

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithJavaAnnotation() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list with java annotation
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).mapJavaAnnotation(GraphQLDirective.class).collect(Collectors.toList()));
    }

}
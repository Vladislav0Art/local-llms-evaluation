package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithDirectives {

    @Test
    public void testBuildWithDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals("directives", graphqlDirectives.get(0).getName());
    }

}
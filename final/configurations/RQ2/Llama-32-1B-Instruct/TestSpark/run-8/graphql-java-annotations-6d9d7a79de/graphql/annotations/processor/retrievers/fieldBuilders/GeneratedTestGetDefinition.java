package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGetDefinition {

    @Test
    public void testGetDefinition() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals(1, graphqlDirectives.size());
    }

}
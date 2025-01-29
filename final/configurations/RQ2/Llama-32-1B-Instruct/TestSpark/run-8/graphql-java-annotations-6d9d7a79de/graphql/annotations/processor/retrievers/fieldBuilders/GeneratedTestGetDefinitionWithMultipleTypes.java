package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGetDefinitionWithMultipleTypes {

    @Test
    public void testGetDefinitionWithMultipleTypes() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals(3, graphqlDirectives.size());
    }

}
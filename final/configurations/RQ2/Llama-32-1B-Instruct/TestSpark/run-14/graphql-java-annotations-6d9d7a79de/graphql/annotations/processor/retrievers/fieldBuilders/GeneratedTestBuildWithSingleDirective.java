package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithSingleDirective {

    @Test
    public void testBuildWithSingleDirective() {
        AnnotatedElement annotation = new AnnotatedElement("GraphQLDirectives");
        ProcessingElementsContainer container = new ProcessingElementsContainer(new ArrayList<>());
        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithMultipleDirectives {

    @Test
    public void testBuildWithMultipleDirectives() {
        AnnotatedElement annotation = new AnnotatedElement("GraphQLDirectives");
        ProcessingElementsContainer container = new ProcessingElementsContainer(new ArrayList<>());
        DirectivesBuilder builder = new DirectivesBuilder(annotation, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(3, directives.length);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutArguments {

    @Test
    public void testBuildWithoutArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

}
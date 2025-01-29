package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutMultipleDirectives {

    @Test
    public void testBuildWithoutMultipleDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

}
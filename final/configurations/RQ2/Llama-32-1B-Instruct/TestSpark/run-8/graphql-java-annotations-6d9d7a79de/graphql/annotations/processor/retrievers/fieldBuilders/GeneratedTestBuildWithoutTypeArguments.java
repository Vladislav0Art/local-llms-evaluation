package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutTypeArguments {

    @Test
    public void testBuildWithoutTypeArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

}
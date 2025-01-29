package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildMethodWithSingleArgument {

    private DirectivesBuilder directivesBuilder;
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void testBuildMethodWithSingleArgument() {
        Argument argument = new GraphQLArgument("arg", "String");
        processingElementsContainer = new ProcessingElementsContainer(new ArrayList<>());
        Object result = directivesBuilder.build(argument);
        assert (result instanceof GraphQLDirective[]);
        directivesBuilder = new DirectivesBuilder(object, processingElementsContainer);
    }

}
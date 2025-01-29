package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildMethodWithMultipleArguments {

    private DirectivesBuilder directivesBuilder;
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void testBuildMethodWithMultipleArguments() {
        Argument[] arguments = new GraphQLArgument[2];
        for (int i = 0; i < 2; i++) {
            arguments[i] = new GraphQLArgument("arg", "String");
        }
        processingElementsContainer = new ProcessingElementsContainer(new ArrayList<>());
        Object result = directivesBuilder.build(arguments);
        assert (result instanceof GraphQLDirective[]);
    }

}
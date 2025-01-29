package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildMethodWithSingleType {

    private DirectivesBuilder directivesBuilder;
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void testBuildMethodWithSingleType() {
        Argument argument = new GraphQLArgument("type", GraphQLScalarType.of(1));
        processingElementsContainer = new ProcessingElementsContainer(new ArrayList<>());
        Object result = directivesBuilder.build(argument);
        assert (result instanceof GraphQLDirective[]);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void testBuildMethodWithoutArguments() {
        AnnotatedElement object = directivesBuilder.build();
        assert object == null;
    }

    @Test
    public void testBuildMethodWithSingleArgument() {
        Argument argument = new GraphQLArgument("arg", "String");
        processingElementsContainer = new ProcessingElementsContainer(new ArrayList<>());
        Object result = directivesBuilder.build(argument);
        assert (result instanceof GraphQLDirective[]);
        directivesBuilder = new DirectivesBuilder(object, processingElementsContainer);
    }

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

    @Test
    public void testBuildMethodWithSingleType() {
        Argument argument = new GraphQLArgument("type", GraphQLScalarType.of(1));
        processingElementsContainer = new ProcessingElementsContainer(new ArrayList<>());
        Object result = directivesBuilder.build(argument);
        assert (result instanceof GraphQLDirective[]);
    }

    @Test
    public void testBuildMethodWithoutTypeArguments() {
        directivesBuilder = new DirectivesBuilder(null, null);
        assert (directivesBuilder == null);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildFieldBuilders_directive_array {

    private ProcessingElementsContainer container;
    private GraphQLDirectives directives;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildFieldBuilders_directive_array() {
        Assert.assertTrue(directives.build() == Arrays.asList(
                new GraphQLDirective(new GraphQLDirective.Builder().directive("type", Arrays.asList(GraphQLScalarType.STRING)).build()),
                new GraphQLDirective(new GraphQLDirective.Builder().directive("value", "value").build()))
        )
		);
    }

    private GraphQLDirective[] buildFieldBuildersDirectives() {
        return Arrays.asList(
                new GraphQLDirectiveBuilder()
                        .directive("type", Arrays.asList(GraphQLScalarType.STRING))
                        .build(),
                new GraphQLDirectiveBuilder()
                        .directive("value", Arrays.asList("value"))
                        .build()
        );
    }

}
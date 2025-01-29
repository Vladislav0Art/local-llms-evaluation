package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildFieldBuilders_directive_type {

    private ProcessingElementsContainer container;
    private GraphQLDirectives directives;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildFieldBuilders_directive_type() {
        Assert.assertTrue(directives.build() == Arrays.asList(
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("type").type(GraphQLScalarType.STRING).build()),
                        GraphQLDirective.newBuilder(GraphQLArgument.builder().name("value").type(GraphQLScalarType.STRING).build())
                )
        );
    }

}
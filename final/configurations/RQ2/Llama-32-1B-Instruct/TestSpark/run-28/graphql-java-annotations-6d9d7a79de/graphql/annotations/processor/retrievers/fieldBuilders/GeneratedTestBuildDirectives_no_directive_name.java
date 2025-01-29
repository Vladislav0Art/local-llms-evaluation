package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildDirectives_no_directive_name {

    private ProcessingElementsContainer container;
    private GraphQLDirectives directives;

    @Before
    public void setup() {
        AnnotatedElement object = new TestObjectAnnotation();
        container = new ProcessingElementsContainer();
        directives = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildDirectives_no_directive_name() {
        assertResult(Arrays.asList(
                new GraphQLDirective[]{
                        new GraphQLDirective(new GraphQLDirective.Builder().directive("value", "value").build())
                }
        ), buildDirectives());
    }

    private List<GraphQLDirective> buildDirectives() {
        return Arrays.asList(
                new GraphQLDirective(new GraphQLDirective.Builder().directive("value", "value").build()))
		);
    }

}
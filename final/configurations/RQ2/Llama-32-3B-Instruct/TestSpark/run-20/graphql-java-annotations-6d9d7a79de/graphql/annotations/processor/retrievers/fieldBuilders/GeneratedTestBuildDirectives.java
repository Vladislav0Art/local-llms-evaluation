package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildDirectives {

    @Before
    public void setup() {
        // set up test data
    }

    @Test
    public void testBuildDirectives() {
        TestGraphQLDirectiveBuilder builder = new TestGraphQLDirectiveBuilder(Collections.singletonList(new AnnotatedElement()));
        GraphQLDirective[] directives = builder.build();
        Assertions.assertEquals(1, directives.length);
    }

}
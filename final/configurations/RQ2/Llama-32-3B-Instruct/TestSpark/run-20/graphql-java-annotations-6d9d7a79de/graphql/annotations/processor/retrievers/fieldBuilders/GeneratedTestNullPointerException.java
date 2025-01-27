package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestNullPointerException {

    @Before
    public void setup() {
        // set up test data
    }

    @Test
    public void testNullPointerException() {
        TestGraphQLDirectiveBuilder builder = new TestGraphQLDirectiveBuilder(null);
        GraphQLDirective[] directives = builder.build();
    }

}
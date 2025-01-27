package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestEmptyElements {

    @Before
    public void setup() {
        // set up test data
    }

    @Test
    public void testEmptyElements() {
        TestGraphQLDirectiveBuilder builder = new TestGraphQLDirectiveBuilder(Collections.emptyList());
        GraphQLDirective[] directives = builder.build();
        Assertions.assertEquals(0, directives.length);
    }

}
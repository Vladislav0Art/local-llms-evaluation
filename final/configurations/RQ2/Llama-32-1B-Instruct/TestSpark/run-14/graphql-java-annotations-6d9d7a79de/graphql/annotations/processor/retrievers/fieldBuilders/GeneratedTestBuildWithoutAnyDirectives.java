package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutAnyDirectives {

    @Test
    public void testBuildWithoutAnyDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        GraphQLDirective[] directives = builder.build();
        assertEquals(0, directives.length);
    }

}
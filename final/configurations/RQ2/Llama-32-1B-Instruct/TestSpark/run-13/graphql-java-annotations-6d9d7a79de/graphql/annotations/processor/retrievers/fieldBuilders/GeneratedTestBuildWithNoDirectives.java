package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithNoDirectives {

    @Test
    public void testBuildWithNoDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(AnnotatedElement.class, null);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

}
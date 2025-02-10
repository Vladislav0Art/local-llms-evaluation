package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectives {

    private static final String OBJECT = "object";
    private static final String DIRECTIVE_NAME_1 = "directive1";
    private static final String DIRECTIVE_NAME_2 = "directive2";

    @Test
    public void buildDirectives() throws Exception {
        List<Directive> directives = new ArrayList<>();
        directives.add(new Directive(DIRECTIVE_NAME_1));
        directives.add(new Directive(DIRECTIVE_NAME_2));

        assertThrows(GraphQLAnnotationsException.class, () -> new DirectivesBuilder(OBJECT, null).build());
    }

}
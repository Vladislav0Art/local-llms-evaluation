package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesPublicStaticMethod {

    private static final String OBJECT = "object";
    private static final String DIRECTIVE_NAME_1 = "directive1";
    private static final String DIRECTIVE_NAME_2 = "directive2";

    @Test
    public void buildDirectivesPublicStaticMethod() {
        List<Directive> directives = new ArrayList<>();
        directives.add(new Directive(DIRECTIVE_NAME_1));
        directives.add(new Directive(DIRECTIVE_NAME_2));

        try {
            DirectivesBuilder.build(OBJECT, null);
            Assert.fail("Expected exception was not thrown");
        } catch (GraphQLAnnotationsException e) {
            // Expected
        }
    }

}
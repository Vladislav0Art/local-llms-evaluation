package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesNoDirectives {

    private static final String OBJECT = "object";
    private static final String DIRECTIVE_NAME_1 = "directive1";
    private static final String DIRECTIVE_NAME_2 = "directive2";

    @Test
    public void buildDirectivesNoDirectives() throws Exception {
        List<Directive> directives = Collections.emptyList();

        DirectivesBuilder builder = new DirectivesBuilder(OBJECT, null);
        builder.addDirective(new Directive("directive3"));
        builder.build();

        Assert.assertEquals(1, builder.getDirectives().size());
    }

}
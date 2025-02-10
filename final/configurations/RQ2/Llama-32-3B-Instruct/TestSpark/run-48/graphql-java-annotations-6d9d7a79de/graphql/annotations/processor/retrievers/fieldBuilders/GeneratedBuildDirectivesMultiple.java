package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesMultiple {

    private static final String OBJECT = "object";
    private static final String DIRECTIVE_NAME_1 = "directive1";
    private static final String DIRECTIVE_NAME_2 = "directive2";

    @Test
    public void buildDirectivesMultiple() throws Exception {
        List<Directive> directives = Arrays.asList(
                new Directive(DIRECTIVE_NAME_1),
                new Directive(DIRECTIVE_NAME_2)
        );

        DirectivesBuilder builder = new DirectivesBuilder(OBJECT, null);
        builder.addDirective(new Directive("directive4"));
        builder.addDirective(new Directive("directive5"));
        builder.build();

        Assert.assertEquals(3, builder.getDirectives().size());
    }
}

class DirectivesBuilder {
    private final String object;
    private List<Directive> directives;

    public DirectivesBuilder(String object, String[] args) {
        this.object = object;
        this.directives = new ArrayList<>();
    }

    public void addDirective(Directive directive) {
        directives.add(directive);
    }

    public List<Directive> getDirectives() {
        return directives;
    }

    public static List<Directive> build(String object, String[] args) throws GraphQLAnnotationsException {
        // implementation
        throw new GraphQLAnnotationsException();
    }
}

class Directive {
    private final String name;

    public Directive(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest1 {

    @Test
    public void test1() throws Exception {
        String schema = "type Query { hello }";
        DirectivesBuilder builder = new DirectivesBuilder(schema);
        List<Directive> directives = builder.build();
        Assert.assertEquals(1, directives.size());
    }
}

class DirectivesBuilder {
    private int directiveCount;
    private List<Directive> directives;

    public DirectivesBuilder(String schema) throws Exception {
        // implementation
    }

    public void build() {
        this.directiveCount++;
    }

    public List<Directive> getDirectives() {
        return directives;
    }
}

class Directive {
    private String name;

    public Directive(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{'name': '" + name + "'}";
    }

}
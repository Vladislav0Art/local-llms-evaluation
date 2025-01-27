package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private String code;

    public void directive(String name) {
        code += "directive " + name;
    }

    public GraphQLDirective[] getDirectives() {
        return code.split("\\s+").length == 0 ? new GraphQLDirective[0] : new GraphQLDirective[code.length()];
    }
}

class FieldBuilderTest {

    @Test
    public void testFieldBuilder() {
        // Create a field builder instance
        FieldBuilder fieldBuilder = new FieldBuilder();

        // Define directives
        String directive1 = "directive1";
        String directive2 = "directive2";

        // Generate code with directives
        fieldBuilder.directive(directive1);
        fieldBuilder.directive(directive2);

        // Get generated directives
        GraphQLDirective[] directives = fieldBuilder.getDirectives();

        // Assert directives are generated correctly
        assertTrue(directives.length == 2 && directives[0].getName().equals(directive1) && directives[1].getName().equals(directive2));
    }
}

class FieldBuilderTest {
    public static void main(String[] args) {
        FieldBuilderTest test = new FieldBuilderTest();
        test.testFieldBuilder();
    }
}

public class GraphQLDirective {
    private String name;

    public GraphQLDirective(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
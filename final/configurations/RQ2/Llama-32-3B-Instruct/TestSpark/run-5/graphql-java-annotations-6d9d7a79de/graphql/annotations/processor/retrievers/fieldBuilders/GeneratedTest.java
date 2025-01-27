package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    public static void main(String[] args) throws Exception {
        TestDirectiveBuilder test = new TestDirectiveBuilder();
        test.testFail();
        test.testNewDirectiveBuilder();
    }
}

public class DirectivesBuilder {

    public Object build(GraphQLAnnotationsException exception) throws Exception {
        // implement the logic for building directives
        return null;
    }

    public GraphQLArgument createDirectivesArg(String argName) throws Exception {
        // implement the logic for creating a new argument
        return new GraphQLArgument();
    }

    public GraphQLDirective directive(String name) throws Exception {
        // implement the logic for creating a new directive
        return new GraphQLDirective();
    }
}

public class TestDirectiveBuilder {

}
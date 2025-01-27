package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestNewDirectiveBuilder {

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
        return null;
    }

    public GraphQLDirective directive(String name) throws Exception {
        // implement the logic for creating a new directive
        return null;
    }
}

public class TestDirectiveBuilder {

    @Test
    public void testNewDirectiveBuilder() throws Exception {
        Method method = DirectivesBuilder.class.getDeclaredMethod("build", GraphQLAnnotationsException.class);
        method.setAccessible(true);
        Object builder = method.invoke(null, new GraphQLAnnotationsException("Test Exception"));

        // Cast to avoid compilation error
        DirectivesBuilder newBuilder = (DirectivesBuilder) builder;

        // Test new methods
        Method createDirectivesArgMethod = newBuilder.getClass().getDeclaredMethod("createDirectivesArg", String.class);
        createDirectivesArgMethod.setAccessible(true);
        GraphQLArgument argument1 = (GraphQLArgument) createDirectivesArgMethod.invoke(newBuilder, "arg1");
        assert argument1 != null;

        method = newBuilder.getClass().getDeclaredMethod("directive", String.class);
        method.setAccessible(true);
        GraphQLDirective directive3 = (GraphQLDirective) method.invoke(newBuilder, "directive3");
        assert directive3 != null;
    }
}

public class GraphQLAnnotationsException extends Exception {
}

public class GraphQLArgument {
}

}
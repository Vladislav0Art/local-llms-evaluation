package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private Class<?> fieldClass;
    private Class<?> argClass;

    public static DirectivesBuilder createDirectivesBuilder(Class<?> fieldClass, Class<?> argClass) {
        return new DirectivesBuilder(fieldClass, argClass);
    }

    public Object[] build() {
        // implement logic to return an array
        return new Object[]{};
    }
}

public class DirectiveBuilder {
    public static class Field {
    }

    public static class Method {
    }

    public static class DirectivesBuilderCreator {
        public static DirectivesBuilder createDirectivesBuilder(Class<?> fieldClass, Class<?> argClass) {
            return DirectivesBuilder.createDirectivesBuilder(fieldClass, argClass);
        }
    }
}

public class DirectivesBuilderTest {

}
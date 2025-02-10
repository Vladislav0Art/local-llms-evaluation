package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestConstructObject {

    private Class<?> fieldClass;
    private Class<?> argClass;

    public DirectivesBuilder(Class<?> fieldClass, Class<?> argClass) {
        this.fieldClass = fieldClass;
        this.argClass = argClass;
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
            return new DirectivesBuilder(fieldClass, argClass);
        }
    }
}

public class DirectivesBuilderTest {

    @Test
    public void testConstructObject() {
        DirectiveBuilder.DirectivesBuilderCreator directivesBuilder = DirectiveBuilder.DirectivesBuilderCreator.createDirectivesBuilder(Object.class, Object.class);
        DirectivesBuilder directivesBuilderInstance = (DirectivesBuilder) directivesBuilder;
        Object[] result = directivesBuilderInstance.build();
        assertFalse(result.length == 0);
    }

}
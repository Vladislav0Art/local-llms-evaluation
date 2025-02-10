package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestConstructor {

    public static GraphQLDirective getDirective(DirectiveJavaAnnotation annotation) {
        return new GraphQLDirective(
                annotation.value(),
                annotation.type()
        );
    }
}

class GraphQLDirective {
    private String value;
    private String type;

    public GraphQLDirective(String value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphQLDirective that = (GraphQLDirective) o;
        return Objects.equals(value, that.value) && Objects.equals(type, that.type);
    }
}

class DirectiveJavaAnnotation {
    private String value;
    private String type;

    public DirectiveJavaAnnotation(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String value() {
        return value;
    }

    public String type() {
        return type;
    }
}

public class TestGeneratedFields {

    @Test
    public void testConstructor() {
        DirectiveJavaAnnotation annotation = new DirectiveJavaAnnotation("value", "type");
        DirectiveJavaAnnotationUtil util = new DirectiveJavaAnnotationUtil();
        GraphQLDirective directive = util.getDirective(annotation);

        assertNotNull(directive);
    }

}
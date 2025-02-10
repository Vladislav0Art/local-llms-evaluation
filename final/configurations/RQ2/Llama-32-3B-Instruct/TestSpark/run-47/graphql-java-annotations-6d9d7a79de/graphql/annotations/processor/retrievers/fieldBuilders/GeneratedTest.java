package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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
    public void testDirectives() {
        DirectiveJavaAnnotationUtil util = new DirectiveJavaAnnotationUtil();
        GraphQLDirective directive1 = util.getDirective(new DirectiveJavaAnnotation("value1", "type1"));
        GraphQLDirective directive2 = util.getDirective(new DirectiveJavaAnnotation("value2", "type2"));

        List<GraphQLDirective> directives = Arrays.asList(directive1, directive2);

        assertEquals(2, directives.size());
    }
}

@Test
public void testEquals() {
    DirectiveJavaAnnotationUtil util = new DirectiveJavaAnnotationUtil();
    GraphQLDirective directive1 = util.getDirective(new DirectiveJavaAnnotation("value1", "type1"));
    GraphQLDirective directive2 = util.getDirective(new DirectiveJavaAnnotation("value1", "type1"));

    assertEquals(directive1, directive2);
}

@Test
public void testConstructor() {
    DirectiveJavaAnnotation annotation = new DirectiveJavaAnnotation("value", "type");
    DirectiveJavaAnnotationUtil util = new DirectiveJavaAnnotationUtil();
    GraphQLDirective directive = util.getDirective(annotation);

    assertNotNull(directive);
}

}
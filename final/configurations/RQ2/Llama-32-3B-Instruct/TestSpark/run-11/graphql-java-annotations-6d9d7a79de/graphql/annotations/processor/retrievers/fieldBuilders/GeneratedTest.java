package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private String directive;
    private boolean isPublic;

    public GraphQLDirective(String directive, boolean isPublic) {
        this.directive = directive;
        this.isPublic = isPublic;
    }

    public String getDirective() {
        return directive;
    }

    public void setDirective(String directive) {
        this.directive = directive;
    }

    public boolean isPublic() {
        return isPublic;
    }
}

public class TestGraphQLDirective {

    @Test
    public void testActivedirective() {
        GraphQLDirective directive = new GraphQLDirective("ACTIVATION", true);
        assertEquals("ACTIVATION", directive.getDirective());
        assertTrue(directive.isPublic());
    }

    @Test
    public void testOtherDirectives() {
        GraphQLDirective directive = new GraphQLDirective("OTHER", false);
        assertEquals("OTHER", directive.getDirective());
        assertFalse(directive.isPublic());
    }

}
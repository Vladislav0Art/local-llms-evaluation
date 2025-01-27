package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestOtherDirectives {

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
    public void testOtherDirectives() {
        GraphQLDirective directive = new GraphQLDirective("OTHER", false);
        assertEquals("OTHER", directive.getDirective());
        assertFalse(directive.isPublic());
    }

}
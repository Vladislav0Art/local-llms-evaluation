package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestActivedirective {

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

}
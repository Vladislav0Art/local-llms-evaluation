package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGenerateCustomFilter {

    public static class CustomFilterFunction implements Function<List<GraphQLDirective>, List<GraphQLDirective>> {
        @Override
        public List<GraphQLDirective> apply(List<GraphQLDirective> directives) {
            return directives;
        }
    }

    public static class GraphQLDirectiveBuilder {
        private List<GraphQLDirective> directives;

        public GraphQLDirectiveBuilder() {
            this.directives = new ArrayList<>();
        }

        public CustomFilterFunction getCustomFilter() {
            return (directives) -> directives;
        }

        public List<GraphQLDirective> generateDirectives(List<GraphQLDirective> directives) {
            return directives;
        }

        public List<GraphQLDirective> build() {
            return this.directives;
        }

        public GraphQLDirective newDirective(String name, String type) {
            GraphQLDirective directive = new GraphQLDirective(name, type);
            this.directives.add(directive);
            return directive;
        }
    }

    @Test
    public void testGenerateCustomFilter() {
        // implementation
    }

}
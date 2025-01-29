package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutDirectives {

    @Test
    public void testBuildWithoutDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

}
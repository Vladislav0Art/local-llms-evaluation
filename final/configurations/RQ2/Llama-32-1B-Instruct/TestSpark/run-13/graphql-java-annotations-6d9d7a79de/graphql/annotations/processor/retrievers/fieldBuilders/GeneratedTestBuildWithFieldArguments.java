package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithFieldArguments {

    @Test
    public void testBuildWithFieldArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        MockitoAnnotations.initMocks(builder);
        assertEquals(1, Mockito.getMockCount(DirectivesBuilder.class));
    }

}
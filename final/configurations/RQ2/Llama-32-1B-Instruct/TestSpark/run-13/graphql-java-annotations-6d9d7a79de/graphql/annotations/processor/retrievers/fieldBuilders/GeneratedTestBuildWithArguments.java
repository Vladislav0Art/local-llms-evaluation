package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithArguments {

    @Test
    public void testBuildWithArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        MockitoAnnotations.initMocks(builder);
        assertEquals(2, Mockito.getMockCount(DirectivesBuilder.class));
    }

}
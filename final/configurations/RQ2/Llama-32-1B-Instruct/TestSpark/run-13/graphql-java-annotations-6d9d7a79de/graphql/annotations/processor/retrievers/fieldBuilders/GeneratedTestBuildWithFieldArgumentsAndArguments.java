package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithFieldArgumentsAndArguments {

    @Test
    public void testBuildWithFieldArgumentsAndArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        MockitoAnnotations.initMocks(builder);
        assertEquals(3, Mockito.getMockCount(DirectivesBuilder.class));
    }

}
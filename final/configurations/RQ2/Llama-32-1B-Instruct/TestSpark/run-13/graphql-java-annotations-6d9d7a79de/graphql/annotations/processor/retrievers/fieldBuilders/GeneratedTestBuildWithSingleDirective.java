package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithSingleDirective {

    @Test
    public void testBuildWithSingleDirective() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        directiveList.add(newDirective(DirectiveJavaAnnotationUtil.INDICATE_FIELD_NAME, "field_name"));
        MockitoAnnotations.initMocks(builder);
        assertEquals(1, Mockito.getMockCount(DirectivesBuilder.class));
    }

}
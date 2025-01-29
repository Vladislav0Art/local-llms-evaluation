package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithMultipleDirectives {

    @Test
    public void testBuildWithMultipleDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(AnnotatedElement.class, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        directiveList.add(newDirective(DirectiveJavaAnnotationUtil.INDICATE_FIELD_NAME, "field_name"));
        directiveList.add(newDirective(DirectiveJavaAnnotationUtil.INCLUDE_FIELD_NAME, "include_field_name"));
        MockitoAnnotations.initMocks(builder);
        assertEquals(2, Mockito.getMockCount(DirectivesBuilder.class));
    }

}
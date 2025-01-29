package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void testBuildWithoutDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

    @Test
    public void testBuildWithNoDirectives() {
        DirectivesBuilder builder = new DirectivesBuilder(AnnotatedElement.class, null);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

    @Test
    public void testBuildWithSingleDirective() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        directiveList.add(newDirective(DirectiveJavaAnnotationUtil.INDICATE_FIELD_NAME, "field_name"));
        MockitoAnnotations.initMocks(builder);
        assertEquals(1, Mockito.getMockCount(DirectivesBuilder.class));
    }

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

    @Test
    public void testBuildWithFieldArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        MockitoAnnotations.initMocks(builder);
        assertEquals(1, Mockito.getMockCount(DirectivesBuilder.class));
    }

    @Test
    public void testBuildWithArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        MockitoAnnotations.initMocks(builder);
        assertEquals(2, Mockito.getMockCount(DirectivesBuilder.class));
    }

    @Test
    public void testBuildWithFieldArgumentsAndArguments() {
        DirectivesBuilder builder = new DirectivesBuilder(null, ProcessingElementsContainer.empty());
        GraphQLDirective[] directives = builder.build();
        List<GraphQLDirective> directiveList = new ArrayList<>();
        MockitoAnnotations.initMocks(builder);
        assertEquals(3, Mockito.getMockCount(DirectivesBuilder.class));
    }

}
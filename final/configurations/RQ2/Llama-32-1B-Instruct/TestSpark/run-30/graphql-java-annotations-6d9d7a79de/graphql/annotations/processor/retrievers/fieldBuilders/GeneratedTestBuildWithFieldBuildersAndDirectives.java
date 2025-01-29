package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithFieldBuildersAndDirectives {

    private DirectivesBuilderDirectivesTest() {
    }

    @Test
    public void testBuildWithFieldBuildersAndDirectives() {
        AnnotatedElement object = DirectivesBuilder.class.getAnnotation(DirectivesBuilder.class);
        ProcessingElementsContainer container = object.processingElementsContainer();

        FieldBuilder fieldBuilder1 = new FieldBuilder("field1", GraphQLType.listOf(GraphQLArgument.string()));
        FieldBuilder fieldBuilder2 = new FieldBuilder("field2", GraphQLDirective.newDirective(GraphQLDirectives.ANY));
        DirectivesBuilder[] buildResult = new DirectivesBuilder[2];
        Arrays.fill(buildResult, directivesBuilder.build());

        Assert.assertTrue(Arrays.stream(buildResult).anyMatch(d -> d instanceof GraphQLDirective || d instanceof GraphQLDirectives));

        DirectivesBuilder[] buildResultWithDirectives = new DirectivesBuilder[1];
        buildResult[0] = directivesBuilder.build();
        Assert.assertTrue(Arrays.stream(buildResultWithDirectives).anyMatch(d -> d instanceof GraphQLDirective));
    }

}
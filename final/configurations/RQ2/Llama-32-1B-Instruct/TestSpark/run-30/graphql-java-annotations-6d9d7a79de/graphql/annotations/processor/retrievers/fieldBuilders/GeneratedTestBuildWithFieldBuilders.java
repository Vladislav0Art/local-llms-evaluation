package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithFieldBuilders {

    @Test
    public void testBuildWithFieldBuilders() {
        AnnotatedElement object = DirectivesBuilder.class.getAnnotation(DirectivesBuilder.class);
        ProcessingElementsContainer container = object.processingElementsContainer();

        FieldBuilder fieldBuilder1 = new FieldBuilder("field1", GraphQLType.listOf(GraphQLArgument.string()));
        FieldBuilder fieldBuilder2 = new FieldBuilder("field2", GraphQLDirective.newDirective(GraphQLDirectives.ANY));
        Object[] buildResult = new Object[2];
        buildResult[0] = directivesBuilder.build();
        buildResult[1] = fieldBuilder1.build();
        buildResult[1] = fieldBuilder2.build();
        Assert.assertTrue(Arrays.stream(buildResult).anyMatch(d -> d instanceof GraphQLDirective || d instanceof GraphQLDirectives));

        DirectivesBuilder[] buildResultWithDirectives = new DirectivesBuilder[1];
        buildResultWithDirectives[0] = directivesBuilder.build();
        Assert.assertTrue(Arrays.stream(buildResultWithDirectives).anyMatch(d -> d instanceof GraphQLDirective));
    }

}
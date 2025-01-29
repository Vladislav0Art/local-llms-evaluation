package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithNoFieldBuilders {

    @Test
    public void testBuildWithNoFieldBuilders() {
        AnnotatedElement object = DirectivesBuilder.class.getAnnotation(DirectivesBuilder.class);
        ProcessingElementsContainer container = object.processingElementsContainer();

        FieldBuilder fieldBuilder1 = new FieldBuilder("field1", GraphQLType.listOf(GraphQLArgument.string()));
        Object[] buildResult = new Object[2];
        buildResult[0] = directivesBuilder.build();
        buildResult[1] = fieldBuilder1.build();
        Assert.assertTrue(Arrays.stream(buildResult).anyMatch(d -> d instanceof GraphQLDirective));
    }

}
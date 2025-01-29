package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        AnnotatedElement object = DirectivesBuilder.class.getAnnotation(DirectivesBuilder.class);
        ProcessingElementsContainer container = object.processingElementsContainer();

        GraphQLDirective[] buildResult = new DirectivesBuilder().build();
        Assert.assertTrue(Arrays.stream(buildResult).anyMatch(d -> d instanceof GraphQLDirective));
    }

}
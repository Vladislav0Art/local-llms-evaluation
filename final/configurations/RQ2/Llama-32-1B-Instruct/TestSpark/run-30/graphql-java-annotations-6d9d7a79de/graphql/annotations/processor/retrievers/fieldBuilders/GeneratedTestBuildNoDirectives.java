package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildNoDirectives {

    @Test
    public void testBuildNoDirectives() {
        AnnotatedElement object = DirectivesBuilder.class.getAnnotation(DirectivesBuilder.class);
        ProcessingElementsContainer container = object.processingElementsContainer();

        Object[] buildResult = new Object[1];
        buildResult[0] = directivesBuilder.build();
        Assert.assertTrue(Arrays.stream(buildResult).anyMatch(d -> d instanceof GraphQLDirective));
    }

}
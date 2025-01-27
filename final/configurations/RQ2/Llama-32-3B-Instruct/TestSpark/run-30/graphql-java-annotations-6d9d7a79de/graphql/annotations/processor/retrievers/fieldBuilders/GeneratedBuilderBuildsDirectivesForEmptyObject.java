package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderBuildsDirectivesForEmptyObject {

    @Test
    public void builderBuildsDirectivesForEmptyObject() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        List<GraphQLDirective> directives = builder.build();

        Assert.assertTrue(directives.isEmpty());
    }

}
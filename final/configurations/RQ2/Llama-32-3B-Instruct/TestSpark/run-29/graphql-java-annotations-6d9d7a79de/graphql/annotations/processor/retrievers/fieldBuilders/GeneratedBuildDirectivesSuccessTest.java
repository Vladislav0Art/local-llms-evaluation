package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildDirectivesSuccessTest {

    @Test
    public void buildDirectivesSuccessTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        List<GraphQLDirective> directives = Arrays.asList(
                newDirective("test", "type"),
                newDirective("test2", "type")
        );
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertArrayEquals(directives.stream().map(d -> (GraphQLDirective) d).toArray(GraphQLDirective[]::new), result);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilderBuildNoDirectives {

    @Test
    public void testDirectivesBuilderBuildNoDirectives() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directives = Collections.emptyList();
        assertEquals(directories, (List<GraphQLDirective>) builder.build());
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilderBuild {

    @Test
    public void testDirectivesBuilderBuild() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directives = Arrays.asList(newDirective("testDirective"));
        assertEquals(directories.get(0), (GraphQLDirective) builder.build()[0]);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilderBuildWithMultipleDirectives {

    @Test
    public void testDirectivesBuilderBuildWithMultipleDirectives() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directives = Arrays.asList(newDirective("testDirective1"), newDirective("testDirective2"));
        assertEquals(directories.get(0), (GraphQLDirective) ((List<GraphQLDirective>) builder.build()).get(0));
    }

}
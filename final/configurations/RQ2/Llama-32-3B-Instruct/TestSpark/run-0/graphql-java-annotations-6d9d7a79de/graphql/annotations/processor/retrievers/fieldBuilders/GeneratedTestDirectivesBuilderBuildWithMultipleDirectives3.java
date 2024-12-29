package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilderBuildWithMultipleDirectives3 {

    @Test
    public void testDirectivesBuilderBuildWithMultipleDirectives3() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directives = Arrays.asList(newDirective("testDirective1"), newDirective("testDirective2"));
        assertEquals(directories.size(), ((List<GraphQLDirective>) builder.build()).size());
    }

}
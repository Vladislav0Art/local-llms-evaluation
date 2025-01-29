package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildNoDirectives {

    @Test
    public void testBuildNoDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new DefaultContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(0, result.length); // no directives found
    }

}
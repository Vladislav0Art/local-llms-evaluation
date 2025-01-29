package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilder_NoDirectives {

    @Test
    public void testDirectivesBuilder_NoDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assert !result.isEmpty();
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilder_DirectiveWithNullArguments {

    @Test
    public void testDirectivesBuilder_DirectiveWithNullArguments() throws Exception {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assert !result.isEmpty();
    }

}
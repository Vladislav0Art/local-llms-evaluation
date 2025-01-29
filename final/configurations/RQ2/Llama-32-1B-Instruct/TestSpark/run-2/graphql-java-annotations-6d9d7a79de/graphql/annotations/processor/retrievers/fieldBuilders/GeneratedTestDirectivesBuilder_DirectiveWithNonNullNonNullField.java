package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilder_DirectiveWithNonNullNonNullField {

    @Test
    public void testDirectivesBuilder_DirectiveWithNonNullNonNullField() throws Exception {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assert !result.isEmpty();
    }

}
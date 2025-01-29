package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestDirectivesBuilder_DirectiveWithArgument {

    @Test
    public void testDirectivesBuilder_DirectiveWithArgument() throws Exception {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();
        assert !result.isEmpty();
        Method method = object.getMethod("myMethod");
        Argument argument = (Argument) method.getAnnotation(GraphQLArgument.class);
        assert !argument.isRequired();
    }

}
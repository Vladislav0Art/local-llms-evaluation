package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildOneArgument {

    @Test
    public void testBuildOneArgument() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new DefaultContainer();

        // mocking for GraphQLArgument and GraphQLDirective classes
        DirectiveJavaAnnotationUtil.mockArgument(object, container);
        DirectiveJavaAnnotationUtil.mockDirective(newObject(), container);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(1, result.length); // one argument found
    }

}
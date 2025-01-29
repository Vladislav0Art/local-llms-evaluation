package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildNoArguments {

    @Test
    public void testBuildNoArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new DefaultContainer();

        // mocking for GraphQLArgument and GraphQLDirective classes
        DirectiveJavaAnnotationUtil.mockArgument(object, container);
        DirectiveJavaAnnotationUtil.mockDirective(newObject(), container);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(0, result.length); // no arguments found
    }

}
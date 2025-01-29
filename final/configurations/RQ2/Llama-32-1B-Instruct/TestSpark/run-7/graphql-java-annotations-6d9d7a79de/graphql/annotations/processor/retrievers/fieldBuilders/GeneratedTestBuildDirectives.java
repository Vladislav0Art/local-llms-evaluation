package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildDirectives {

    @Test
    public void testBuildDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new DefaultContainer();

        // mocking for GraphQLArgument and GraphQLDirective classes
        DirectiveJavaAnnotationUtil.mockArgument(object, container);
        DirectiveJavaAnnotationUtil.mockDirective(newObject(), container);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(2, result.length); // multiple directives found
    }

}
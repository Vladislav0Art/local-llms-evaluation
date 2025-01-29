package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void testBuildMultipleArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new DefaultContainer();

        // mocking for GraphQLArgument and GraphQLDirective classes
        DirectiveJavaAnnotationUtil.mockArgument(object, container);
        DirectiveJavaAnnotationUtil.mockDirective(newObject(), container);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(2, result.length); // multiple arguments found
    }

    @Test
    public void testBuildNoDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new DefaultContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        assertEquals(0, result.length); // no directives found
    }

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
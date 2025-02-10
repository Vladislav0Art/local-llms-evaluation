package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void DirectivesBuilder_isInstantiableWithObjectAndContainer() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        try {
            new DirectivesBuilder(object, container);
            assertEquals(0, fail("Expected NullPointerException"));
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithDirectives() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).collect(Collectors.toList()));
    }

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithType() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).mapType(GraphQLDirective.class).collect(Collectors.toList()));
    }

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithArguments() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list with arguments
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).mapArguments(GraphQLDirective.class).collect(Collectors.toList()));
    }

    @Test
    public void DirectivesBuilder_buildReturnsDirectivesWithJavaAnnotation() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> directivesList = new ArrayList<>();
        // set directives in the list with java annotation
        GraphQLDirective[] result = builder.build();
        assertEquals(directivesList, Arrays.stream(result).mapDirectives(GraphQLDirective.class).mapJavaAnnotation(GraphQLDirective.class).collect(Collectors.toList()));
    }

}
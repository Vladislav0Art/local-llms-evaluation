package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setup() {
        // Mock the object and container to be used during testing
        AnnotatedElement annotatedObject = new AnnotatedElement("DirectivesBuilderTest", "testClass");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        directivesBuilder = new DirectivesBuilder(annotatedObject, container);
    }

    @Test
    public void testBuildWithoutValidation() {
        List<GraphQLDirective> directives = Arrays.asList(
                newDirective("field1", GraphQLArgument.name("Field1").type(GraphQLScalarType.STRING)),
                newDirective("field2", GraphQLArgument.type(GraphQLType.INT).name("Field2")
                        .description("Int field")
                        .exampleValue(123)
                        .defaultValue(0))
        );

        GraphQLDirective[] result = directivesBuilder.build();

        assert result.size() == 2;
    }

    @Test
    public void testBuildWithValidation() {
        List<GraphQLDirective> directives = Arrays.asList(
                newDirective("field1", GraphQLArgument.name("Field1").type(GraphQLScalarType.STRING).description("This is a required field")
                        .required())
        );

        try {
            directivesBuilder.build();
            fail("Expected GraphQLAnnotationsException");
        } catch (GraphQLAnnotationsException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithMultipleDirectives() {
        List<GraphQLDirective> directives = Arrays.asList(
                newDirective("field1", GraphQLArgument.name("Field1").type(GraphQLScalarType.STRING)),
                newDirective("field2", GraphQLArgument.type(GraphQLType.INT).name("Field2")
                        .description("Int field")
                        .exampleValue(123)
                        .defaultValue(0))
        );

        GraphQLDirective[] result = directivesBuilder.build();

        assert result.size() == 2;
    }

    @Test
    public void testBuildWithoutDirectives() {
        // Create a new DirectivesBuilder instance with no arguments
        directivesBuilder = new DirectivesBuilder(null, null);

        GraphQLDirective[] result = directivesBuilder.build();

        assert result == null;
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithValidation {

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setup() {
        // Mock the object and container to be used during testing
        AnnotatedElement annotatedObject = new AnnotatedElement("DirectivesBuilderTest", "testClass");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        directivesBuilder = new DirectivesBuilder(annotatedObject, container);
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

}
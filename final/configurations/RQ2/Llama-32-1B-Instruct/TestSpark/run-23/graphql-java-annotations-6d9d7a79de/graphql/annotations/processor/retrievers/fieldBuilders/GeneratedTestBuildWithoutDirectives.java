package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutDirectives {

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setup() {
        // Mock the object and container to be used during testing
        AnnotatedElement annotatedObject = new AnnotatedElement("DirectivesBuilderTest", "testClass");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        directivesBuilder = new DirectivesBuilder(annotatedObject, container);
    }

    @Test
    public void testBuildWithoutDirectives() {
        // Create a new DirectivesBuilder instance with no arguments
        directivesBuilder = new DirectivesBuilder(null, null);

        GraphQLDirective[] result = directivesBuilder.build();

        assert result == null;
    }

}
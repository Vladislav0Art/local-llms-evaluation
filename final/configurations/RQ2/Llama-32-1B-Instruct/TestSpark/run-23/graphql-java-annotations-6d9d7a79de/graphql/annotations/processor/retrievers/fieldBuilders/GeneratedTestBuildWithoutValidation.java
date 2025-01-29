package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithoutValidation {

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

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedShouldBuildDirectives {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement annotatedElement;
    private ProcessingElementsContainer processingElementsContainer;

    @Before
    public void setUp() {
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
    }

    @Test
    public void shouldBuildDirectives() {
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

}
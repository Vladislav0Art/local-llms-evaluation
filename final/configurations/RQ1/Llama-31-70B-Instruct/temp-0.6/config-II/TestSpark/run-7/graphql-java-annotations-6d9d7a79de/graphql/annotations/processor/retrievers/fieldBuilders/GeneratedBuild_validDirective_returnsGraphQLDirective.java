package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_validDirective_returnsGraphQLDirective {

    private ProcessingElementsContainer processingElementsContainer;
    private AnnotatedElement annotatedElement;
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        processingElementsContainer = mock(ProcessingElementsContainer.class);
        annotatedElement = mock(AnnotatedElement.class);
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
    }

    @Test
    public void build_validDirective_returnsGraphQLDirective() {
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        when(processingElementsContainer.getDirectiveRegistry().containsKey(any())).thenReturn(true);
        when(processingElementsContainer.getDirectiveRegistry().get(any()).getDirective()).thenReturn(graphQLDirective);

        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        assertNotNull(graphQLDirectives);
        assertEquals(1, graphQLDirectives.length);
        assertSame(graphQLDirective, graphQLDirectives[0]);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void build_invalidDirective_throwsGraphQLAnnotationsException() {
        when(processingElementsContainer.getDirectiveRegistry().containsKey(any())).thenReturn(false);

        directivesBuilder.build();
    }

}
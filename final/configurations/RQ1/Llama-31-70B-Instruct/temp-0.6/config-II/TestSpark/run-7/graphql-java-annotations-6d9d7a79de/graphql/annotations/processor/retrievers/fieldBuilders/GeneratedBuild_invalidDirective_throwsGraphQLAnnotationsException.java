package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_invalidDirective_throwsGraphQLAnnotationsException {

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
    public void build_invalidDirective_throwsGraphQLAnnotationsException() {
        when(processingElementsContainer.getDirectiveRegistry().containsKey(any())).thenReturn(false);

        directivesBuilder.build();
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withEmptyDirectiveRegistry_shouldThrowException {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        object = mock(AnnotatedElement.class);
        container = mock(ProcessingElementsContainer.class);
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void build_withEmptyDirectiveRegistry_shouldThrowException() {
        when(container.getDirectiveRegistry()).thenReturn(Collections.emptyMap());
        assertThrows(GraphQLAnnotationsException.class, directivesBuilder::build);
    }

}
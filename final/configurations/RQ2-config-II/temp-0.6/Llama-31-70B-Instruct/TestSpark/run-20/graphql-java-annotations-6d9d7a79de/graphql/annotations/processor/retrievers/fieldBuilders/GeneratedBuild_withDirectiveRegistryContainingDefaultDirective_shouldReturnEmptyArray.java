package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withDirectiveRegistryContainingDefaultDirective_shouldReturnEmptyArray {

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
    public void build_withDirectiveRegistryContainingDefaultDirective_shouldReturnEmptyArray() {
        when(container.getDirectiveRegistry()).thenReturn(Collections.singletonMap("directiveName", new GraphQLDirective.Builder().name("directiveName").build()));
        assertArrayEquals(new GraphQLDirective[0], directivesBuilder.build());
    }

}
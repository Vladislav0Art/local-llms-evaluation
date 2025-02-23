package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withDirectiveRegistryContainingCustomDirective_shouldReturnArrayWithCustomDirective {

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
    public void build_withDirectiveRegistryContainingCustomDirective_shouldReturnArrayWithCustomDirective() {
        GraphQLDirective customDirective = new GraphQLDirective.Builder().name("customDirective").build();
        when(container.getDirectiveRegistry()).thenReturn(Collections.singletonMap("customDirective", customDirective));

        GraphQLDirective[] directives = directivesBuilder.build();
        assertEquals(1, directives.length);
        assertEquals(customDirective, directives[0]);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_whenDirectivesJavaAnnotationUtilReturnsGraphQLDirective_returnsGraphQLDirective {

    @Mock
    private AnnotatedElement object;
    @Mock
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void build_whenDirectivesJavaAnnotationUtilReturnsGraphQLDirective_returnsGraphQLDirective() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        Annotation annotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(annotation));
        when(container.getDirectiveRegistry().containsKey(anyString())).thenReturn(true);
        when(container.getDirectiveRegistry().get(anyString()).getDirective()).thenReturn(graphQLDirective);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(1, directives.length);
        assertEquals(graphQLDirective, directives[0]);
    }

}
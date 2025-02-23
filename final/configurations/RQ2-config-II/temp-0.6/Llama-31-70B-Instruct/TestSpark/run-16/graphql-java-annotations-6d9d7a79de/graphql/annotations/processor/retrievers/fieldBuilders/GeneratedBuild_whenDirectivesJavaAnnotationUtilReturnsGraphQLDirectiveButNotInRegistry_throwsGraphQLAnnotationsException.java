package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_whenDirectivesJavaAnnotationUtilReturnsGraphQLDirectiveButNotInRegistry_throwsGraphQLAnnotationsException {

    @Mock
    private AnnotatedElement object;
    @Mock
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void build_whenDirectivesJavaAnnotationUtilReturnsGraphQLDirectiveButNotInRegistry_throwsGraphQLAnnotationsException() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        Annotation annotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(annotation));
        when(container.getDirectiveRegistry().containsKey(anyString())).thenReturn(false);

        directivesBuilder.build();
    }

}
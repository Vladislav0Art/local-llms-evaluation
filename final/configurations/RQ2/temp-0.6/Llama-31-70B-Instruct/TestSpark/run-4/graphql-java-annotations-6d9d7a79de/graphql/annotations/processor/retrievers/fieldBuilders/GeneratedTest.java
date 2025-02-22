package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Mock
    private AnnotatedElement annotatedElement;
    @Mock
    private ProcessingElementsContainer processingElementsContainer;
    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldThrowExceptionWhenNoDirectiveNamedFoundInRegistry() {
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(processingElementsContainer.getDirectiveRegistry().containsKey("directiveName")).thenReturn(false);
        Mockito.when(directive.getName()).thenReturn("directiveName");

        Annotation annotation = Mockito.mock(Annotation.class);
        Mockito.when(directive.getArguments()).thenReturn(new ArrayList<>());
        Mockito.when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement)).thenReturn(new ArrayList<>(Collections.singletonList(annotation)));
        Mockito.when(DirectiveJavaAnnotationUtil.getName(annotation)).thenReturn("directiveName");
        Mockito.when(processingElementsContainer.getDirectiveRegistry().get("directiveName").getDirective()).thenReturn(directive);

        Assertions.assertThrows(GraphQLAnnotationsException.class, () -> directivesBuilder.build());
    }

}
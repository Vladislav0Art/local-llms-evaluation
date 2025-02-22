package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedWhenGetDirectiveAnnotations_thenCorrectAnnotations {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenGetDirectiveAnnotations_thenCorrectAnnotations() {
        // Given

        // When
        List<Annotation> annotations = DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object);

        // Then
        // Verify if the correct annotations are being returned.
    }

}
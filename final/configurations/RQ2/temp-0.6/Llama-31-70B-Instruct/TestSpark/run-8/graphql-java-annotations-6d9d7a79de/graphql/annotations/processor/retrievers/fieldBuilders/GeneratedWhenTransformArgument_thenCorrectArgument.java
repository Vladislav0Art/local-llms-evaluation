package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedWhenTransformArgument_thenCorrectArgument {

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
    public void whenTransformArgument_thenCorrectArgument() {
        // Given

        // When
        directivesBuilder.transformArgument(annotation, directiveBuilder, arguments, i);

        // Then
        // Verify if the correct argument is being transformed.
    }

}
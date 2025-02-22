package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedWhenTransformArgs_thenCorrectArguments {

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
    public void whenTransformArgs_thenCorrectArguments() {
        // Given

        // When
        GraphQLDirective graphQLDirective = directivesBuilder.transformArgs(graphQLDirective, argumentValues);

        // Then
        // Verify if the correct arguments are being transformed.
    }

}
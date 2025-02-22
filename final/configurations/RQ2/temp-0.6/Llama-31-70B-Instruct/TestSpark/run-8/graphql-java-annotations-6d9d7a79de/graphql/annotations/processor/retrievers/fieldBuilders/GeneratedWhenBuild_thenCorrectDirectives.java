package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedWhenBuild_thenCorrectDirectives {

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
    public void whenBuild_thenCorrectDirectives() {
        // Given

        // When
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        // Then
        // Verify if the correct directives are being returned.
    }

}
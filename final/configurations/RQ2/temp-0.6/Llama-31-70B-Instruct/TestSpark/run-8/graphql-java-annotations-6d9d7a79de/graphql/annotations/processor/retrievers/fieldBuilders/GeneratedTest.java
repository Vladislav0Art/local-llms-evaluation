package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void whenGetDirectiveAnnotations_thenCorrectAnnotations() {
        // Given

        // When
        List<Annotation> annotations = DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object);

        // Then
        // Verify if the correct annotations are being returned.
    }

    @Test
    public void whenTransformArgs_thenCorrectArguments() {
        // Given

        // When
        GraphQLDirective graphQLDirective = directivesBuilder.transformArgs(graphQLDirective, annotation);

        // Then
        // Verify if the correct arguments are being transformed.
    }

    @Test
    public void whenTransformArgs_thenCorrectArguments() {
        // Given

        // When
        GraphQLDirective graphQLDirective = directivesBuilder.transformArgs(graphQLDirective, argumentValues);

        // Then
        // Verify if the correct arguments are being transformed.
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
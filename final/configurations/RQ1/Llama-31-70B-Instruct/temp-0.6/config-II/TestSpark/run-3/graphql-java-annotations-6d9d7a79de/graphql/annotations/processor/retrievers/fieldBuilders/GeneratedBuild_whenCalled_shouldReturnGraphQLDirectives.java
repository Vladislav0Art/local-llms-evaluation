package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_whenCalled_shouldReturnGraphQLDirectives {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void build_whenCalled_shouldReturnGraphQLDirectives() {
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        assertNotNull(graphQLDirectives);
        assertTrue(graphQLDirectives.length > 0);
    }

}
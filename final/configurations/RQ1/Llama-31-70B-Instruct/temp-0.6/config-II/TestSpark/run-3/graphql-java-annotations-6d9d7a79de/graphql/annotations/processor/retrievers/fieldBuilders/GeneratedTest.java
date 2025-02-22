package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void transformArgs_whenCalled_shouldReturnGraphQLDirective() {
        GraphQLDirective graphQLDirective = new GraphQLDirective();
        Annotation annotation = new Annotation() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return Annotation.class;
            }
        };
        GraphQLDirective result = directivesBuilder.transformArgs(graphQLDirective, annotation);

        assertNotNull(result);
        assertEquals(result.getName(), graphQLDirective.getName());
    }

}
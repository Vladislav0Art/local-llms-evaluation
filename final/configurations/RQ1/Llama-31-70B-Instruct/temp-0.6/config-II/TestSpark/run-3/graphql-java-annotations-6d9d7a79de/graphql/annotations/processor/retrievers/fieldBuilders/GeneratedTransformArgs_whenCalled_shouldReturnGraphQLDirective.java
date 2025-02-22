package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTransformArgs_whenCalled_shouldReturnGraphQLDirective {

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
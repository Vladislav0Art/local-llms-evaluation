package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Mock
    private AnnotatedElement object;
    @Mock
    private ProcessingElementsContainer container;
    @Mock
    private DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;
    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void buildTest() {
        // setup test data and interactions
        when(container.getDirectiveRegistry().containsKey(any())).thenReturn(true);
        when(directiveJavaAnnotationUtil.getDirectiveAnnotations(any())).thenReturn(new ArrayList<>());

        // execute test method
        GraphQLDirective[] actual = directivesBuilder.build();

        // validate the test result
        assertNotNull(actual);
        assertTrue(actual.length == 0);
    }

    @Test
    public void transformArgsTest() {
        // setup test data and interactions
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        Annotation annotation = mock(Annotation.class);
        when(graphQLDirective.getArguments()).thenReturn(new ArrayList<>());
        when(annotation.annotationType().getDeclaredMethods()).thenReturn(new Method[0]);

        // execute test method
        GraphQLDirective actual = directivesBuilder.transformArgs(graphQLDirective, annotation);

        // validate the test result
        assertNotNull(actual);
    }

}
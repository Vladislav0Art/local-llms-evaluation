package graphql.annotations.processor.retrievers.fieldBuilders;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private GraphQLDirective graphQLDirective;

    @Mock
    private GraphQLArgument graphQLArgument;

    @Mock
    private GraphQLType graphQLType;

    @Mock
    private Annotation annotation;

    @Mock
    private DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;

    @Before
    public void setUp() throws Exception {
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void buildTest() {
        // given
        List<GraphQLDirective> graphQLDirectives = new ArrayList<>();
        graphQLDirectives.add(graphQLDirective);
        DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)
                .forEach(annotation -> {
                    String name = DirectiveJavaAnnotationUtil.getName(annotation);
                    if (container.getDirectiveRegistry().containsKey(name)) {
                        GraphQLDirective graphQLDirective = transformArgs(container.getDirectiveRegistry().get(name).getDirective(), annotation);
                        graphQLDirectives.add(graphQLDirective);
                    } else {
                        throw new GraphQLAnnotationsException(String.format(NOT_FOUND_IN_DIRECTIVE_REGISTRY_ERROR, name), null);
                    }
                }

    }
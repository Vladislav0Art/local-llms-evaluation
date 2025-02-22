package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTransformArgsAnnotationTest {

 2.
         3.
    @Mock
 4.
    private AnnotatedElement annotatedElement;
 5.
         6.
    @Mock
 7.
    private ProcessingElementsContainer processingElementsContainer;
 8.
         9.
    @Mock
 10.
    private DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;
 11.
         12.
    @Mock
 13.
    private DirectiveRegistry directiveRegistry;
 14.
         15.
    @Mock
 16.
    private GraphQLDirective graphQLDirective;
 17.
         18.
    private DirectivesBuilder directivesBuilder;
 19.
         20.
    @Before
 21.

    public void setUp() {
        22. MockitoAnnotations.initMocks(this);
        23. directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        24.
    }
 25.
         26.

    @Test
    public void transformArgsAnnotationTest() {
        34. Annotation annotation = Mockito.mock(Annotation.class);
        35. GraphQLDirective graphQLDirective = Mockito.mock(GraphQLDirective.class);
        36. GraphQLDirective transformedDirective = directivesBuilder.transformArgs(graphQLDirective, annotation);
        37. assertNotNull(transformedDirective);
        38.
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement mockObject;
    private ProcessingElementsContainer mockContainer;
    private GraphQLDirective mockGraphQLDirective;

    @BeforeEach
    public void setUp() {
        mockObject = mock(AnnotatedElement.class);
        mockContainer = mock(ProcessingElementsContainer.class);
        mockGraphQLDirective = mock(GraphQLDirective.class);
        directivesBuilder = new DirectivesBuilder(mockObject, mockContainer);
    }

    @Test
    public void shouldBuildDirectivesFromDirectivesJavaAnnotations() {
        Annotation mockAnnotation = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockObject)).thenReturn(Arrays.asList(mockAnnotation));
        String mockName = "test";
        when(DirectiveJavaAnnotationUtil.getName(mockAnnotation)).thenReturn(mockName);
        when(mockContainer.getDirectiveRegistry().containsKey(mockName)).thenReturn(true);
        GraphQLDirective mockDirective = mock(GraphQLDirective.class);
        when(mockContainer.getDirectiveRegistry().get(mockName).getDirective()).thenReturn(mockDirective);
        GraphQLDirective transformedDirective = mock(GraphQLDirective.class);
        when(transformArgs(mockDirective, mockAnnotation)).thenReturn(transformedDirective);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(1, directives.length);
        assertEquals(transformedDirective, directives[0]);
    }

}
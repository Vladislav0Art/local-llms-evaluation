package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withDirectiveAnnotations_returnsGraphQLDirectives {

    private DirectivesBuilder directivesBuilder;
    private ProcessingElementsContainer processingElementsContainer;
    private AnnotatedElement annotatedElement;

    @BeforeEach
    void setUp() {
        processingElementsContainer = mock(ProcessingElementsContainer.class);
        annotatedElement = mock(AnnotatedElement.class);
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
    }

    @Test
    public void build_withDirectiveAnnotations_returnsGraphQLDirectives() {
        // Arrange
        DirectiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement);
        when(processingElementsContainer.getDirectiveRegistry()).thenReturn(new HashMap<>());
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertNotNull(result);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withGraphQLDirectives_returnsGraphQLDirectives {

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
    public void build_withGraphQLDirectives_returnsGraphQLDirectives() {
        // Arrange
        GraphQLDirectives graphQLDirectives = mock(GraphQLDirectives.class);
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(graphQLDirectives);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertNotNull(result);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_whenObjectIsAnnotated_shouldReturnDirectivesArray {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        object = mock(AnnotatedElement.class);
        container = mock(ProcessingElementsContainer.class);
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void build_whenObjectIsAnnotated_shouldReturnDirectivesArray() {
        // Arrange
        when(object.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(true);
        when(object.getAnnotationsByType(GraphQLDirectives.class)).thenReturn(new Annotation[]{mock(GraphQLDirectives.class)});

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertNotNull(result);
        assertTrue(result.length > 0);
    }

}
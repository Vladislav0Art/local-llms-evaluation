package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_whenObjectIsNotAnnotated_shouldReturnEmptyArray {

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
    public void build_whenObjectIsNotAnnotated_shouldReturnEmptyArray() {
        // Arrange
        when(object.isAnnotationPresent(GraphQLDirectives.class)).thenReturn(false);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertNotNull(result);
        assertEquals(0, result.length);
    }

}
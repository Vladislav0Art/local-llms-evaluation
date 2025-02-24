package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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
    public void build_whenObjectIsNull_shouldThrowException() {
        // Arrange
        object = null;

        // Act and Assert
        assertThrows(GraphQLAnnotationsException.class, directivesBuilder::build);
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
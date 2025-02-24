package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_whenObjectIsNull_shouldThrowException {

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

}
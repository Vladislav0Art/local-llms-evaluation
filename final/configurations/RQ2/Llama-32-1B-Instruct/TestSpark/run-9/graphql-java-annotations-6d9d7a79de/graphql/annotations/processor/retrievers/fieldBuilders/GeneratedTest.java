package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void testBuild_InvalidDirectives() throws Exception, MockitoException {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertNotNull(result);
    }

    @Test
    public void testBuild_ReturnsEmptyArray_WhenNoDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertArrayNotContains(result, GraphQLDirectives.values());
    }

    @Test
    public void testBuild_ReturnsExistingDirectives_WhenNoDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertEquals(0, Arrays.stream(result).filter(d -> d != null && !d.getName().isEmpty()).count());
    }

    @Test
    public void testBuild_AddsExistingDirectives_WhenAdded() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertEquals(1, Arrays.stream(result).filter(d -> d != null && !d.getName().isEmpty()).count());
    }

    @Test
    public void testBuild_AddsExistingDirectivesWhenAddedWithExistingDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertEquals(1, Arrays.stream(result).filter(d -> d != null && !d.getName().isEmpty()).count());
    }

    @Test
    public void testBuild_AddsExistingDirectivesWhenAddedWithNoDirectives() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = builder.build();

        // Assert
        assertEquals(1, Arrays.stream(result).filter(d -> d != null && !d.getName().isEmpty()).count());
    }

    @Test
    public void testBuild_BuilderReturnsBuilder() throws Exception {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        DirectivesBuilder result = (DirectivesBuilder) builder.build();

        // Assert
        assertEquals(builder, result);
    }

}
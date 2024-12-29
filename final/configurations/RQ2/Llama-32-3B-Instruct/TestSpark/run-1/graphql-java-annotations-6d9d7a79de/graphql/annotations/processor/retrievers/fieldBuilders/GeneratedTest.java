package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void constructor_SingleDirectiveBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Assert
        assertEquals(1, builder.getDirectives().size());
    }

    @Test
    public void build_SingleDirectiveBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(1, directives.length);
    }

    @Test
    public void build_MultipleDirectivesBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(2, directives.length);
    }

    @Test
    public void build_MultipleDirectivesAndArgumentsBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(3, directives.length);
    }

    @Test
    public void build_MultipleArgumentsDirectivesBuilderTest() {
        // Arrange
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(4, directives.length);
    }

    @Test
    public void build_NonDirectivableFieldBuilderTest() {
        try {
            AnnotatedElement object = new Object();
            ProcessingElementsContainer container = new ProcessingElementsContainer();

            DirectivesBuilder builder = new DirectivesBuilder(object, container);
            builder.build();
            fail("Expected GraphQLAnnotationsException");
        } catch (GraphQLAnnotationsException e) {
            // Assert
            assertEquals("Non directivable field", e.getMessage());
        }
    }

    @Test
    public void build_InvalidArgumentTypeBuilderTest() {
        try {
            AnnotatedElement object = new Object();
            ProcessingElementsContainer container = new ProcessingElementsContainer();

            DirectivesBuilder builder = new DirectivesBuilder(object, container);
            GraphQLDirective[] directives = builder.build();
            fail("Expected Exception");
        } catch (Exception e) {
            // Assert
            assertEquals("Invalid argument type", e.getMessage());
        }
    }

}

class MockProcessingElementsContainer extends ProcessingElementsContainer {

    @Override
    public List<AnnotatedElement> getNonDirectivableFields() {
        return Arrays.asList(new Object());
    }

    @Override
    public List<String> getValidArgumentsTypes() {
        return Arrays.asList("String", "Integer");
    }

}
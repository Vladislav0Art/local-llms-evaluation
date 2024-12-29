package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_InvalidArgumentTypeBuilderTest {

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
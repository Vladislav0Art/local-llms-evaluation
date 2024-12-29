package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_NonDirectivableFieldBuilderTest {

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

}
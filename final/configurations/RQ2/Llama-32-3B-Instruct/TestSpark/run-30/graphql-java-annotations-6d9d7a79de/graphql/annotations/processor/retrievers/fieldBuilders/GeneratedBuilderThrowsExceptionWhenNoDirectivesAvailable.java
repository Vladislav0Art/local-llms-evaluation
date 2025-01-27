package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderThrowsExceptionWhenNoDirectivesAvailable {

    @Test
    public void builderThrowsExceptionWhenNoDirectivesAvailable() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            builder.build();
            Assert.fail("Expected GraphQLAnnotationsException to be thrown");
        } catch (GraphQLAnnotationsException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.contains("No directives found on the object"));
        }
    }

}
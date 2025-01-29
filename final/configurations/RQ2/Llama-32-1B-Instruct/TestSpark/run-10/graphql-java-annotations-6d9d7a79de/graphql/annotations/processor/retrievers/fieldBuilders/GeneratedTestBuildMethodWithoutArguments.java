package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildMethodWithoutArguments {

    private DirectivesBuilder directivesBuilder;
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void testBuildMethodWithoutArguments() {
        AnnotatedElement object = directivesBuilder.build();
        assert object == null;
    }

}
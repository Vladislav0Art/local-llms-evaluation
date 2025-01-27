package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderInitializedWithCorrectObjectAndContainer {

    @Test
    public void builderInitializedWithCorrectObjectAndContainer() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        Assert.assertNotNull(builder);
        Assert.assertEquals(object, builder.object);
        Assert.assertEquals(container, builder.container);
    }

}
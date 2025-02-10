package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuilderDirectivesList_ValidAnnotatedElement_ExpectNoError {

    @Rule
    public TestRule testRule = new TestRule();

    @Test
    public void builderDirectivesList_ValidAnnotatedElement_ExpectNoError() throws Exception {
        AnnotatedElement element = new AnnotatedElement();
        ProcessingContext context = new ProcessingContext();
        DirectivesBuilder builder = new DirectivesBuilder(context);
        builder.directivesList(element);
        Assert.assertFalse(builder.hasErrors());
    }

}
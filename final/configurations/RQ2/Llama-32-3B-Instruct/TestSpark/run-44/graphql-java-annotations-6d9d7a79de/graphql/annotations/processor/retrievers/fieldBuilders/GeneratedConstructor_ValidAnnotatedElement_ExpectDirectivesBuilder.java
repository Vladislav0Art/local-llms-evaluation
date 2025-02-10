package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedConstructor_ValidAnnotatedElement_ExpectDirectivesBuilder {

    @Rule
    public TestRule testRule = new TestRule();

    @Test
    public void constructor_ValidAnnotatedElement_ExpectDirectivesBuilder() throws Exception {
        AnnotatedElement element = new AnnotatedElement();
        ProcessingContext context = new ProcessingContext();
        DirectivesBuilder builder = new DirectivesBuilder(context);
        builder.build(element);
        Assert.assertEquals(1, Collections.frequency(builder.directivesList(), Directive.newDirective()));
    }

}
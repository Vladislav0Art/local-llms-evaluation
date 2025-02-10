package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedConstructor_ValidAnnotatedElement_ExpectDirectivesBuilderWhenMultiple {

    @Rule
    public TestRule testRule = new TestRule();

    @Test
    public void constructor_ValidAnnotatedElement_ExpectDirectivesBuilderWhenMultiple() throws Exception {
        AnnotatedElement element = new AnnotatedElement();
        ProcessingContext context = new ProcessingContext();
        DirectivesBuilder builder = new DirectivesBuilder(context);
        List<Directive> directivesList = Arrays.asList(Directive.newDirective(), Directive.newDirective());
        builder.build(element, directivesList);
        Assert.assertEquals(2, Collections.frequency(builder.directivesList(), Directive.newDirective()));
    }

}
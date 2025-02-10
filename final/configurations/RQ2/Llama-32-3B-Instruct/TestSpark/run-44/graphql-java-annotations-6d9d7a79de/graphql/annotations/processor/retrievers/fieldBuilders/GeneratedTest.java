package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void constructor_ValidAnnotatedElement_ExpectDirectivesBuilderWhenMultiple() throws Exception {
        AnnotatedElement element = new AnnotatedElement();
        ProcessingContext context = new ProcessingContext();
        DirectivesBuilder builder = new DirectivesBuilder(context);
        List<Directive> directivesList = Arrays.asList(Directive.newDirective(), Directive.newDirective());
        builder.build(element, directivesList);
        Assert.assertEquals(2, Collections.frequency(builder.directivesList(), Directive.newDirective()));
    }

    @Test
    public void builderDirectivesList_ValidAnnotatedElement_ExpectNoError() throws Exception {
        AnnotatedElement element = new AnnotatedElement();
        ProcessingContext context = new ProcessingContext();
        DirectivesBuilder builder = new DirectivesBuilder(context);
        builder.directivesList(element);
        Assert.assertFalse(builder.hasErrors());
    }

    @Test
    public void build_ValidAnnotatedElement_ExpectNoError() throws Exception {
        AnnotatedElement element = new AnnotatedElement();
        ProcessingContext context = new ProcessingContext();
        DirectivesBuilder builder = new DirectivesBuilder(context);
        builder.build(element);
        Assert.assertFalse(builder.hasErrors());
    }
}

public class DirectivesBuilder {

    private List<Directive> directivesList;

    public DirectivesBuilder(ProcessingContext context) {
        this.directoriesList = new ArrayList<>();
    }

    public void directivesList(AnnotatedElement element) {
        this.directoriesList.add(Directive.newDirective(element));
    }

    public void build(AnnotatedElement element, List<Directive> directives) {
        this.directoriesList.addAll(directives);
    }

    public boolean hasErrors() {
        return false;
    }

    public List<Directive> directivesList() {
        return directoriesList;
    }
}

public class Directive {

    private String name;

    public static Directive newDirective(AnnotatedElement element) {
        return new Directive(element.getName());
    }

    private Directive(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AnnotatedElement {
}

}
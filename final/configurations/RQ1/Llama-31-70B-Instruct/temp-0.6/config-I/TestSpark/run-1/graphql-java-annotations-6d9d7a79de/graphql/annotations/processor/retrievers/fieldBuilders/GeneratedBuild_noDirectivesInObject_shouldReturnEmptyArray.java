package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_noDirectivesInObject_shouldReturnEmptyArray {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        object = mock(AnnotatedElement.class);
        container = mock(ProcessingElementsContainer.class);
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void build_noDirectivesInObject_shouldReturnEmptyArray() {
        GraphQLDirective[] directives = directivesBuilder.build();
        Assert.assertEquals(0, directives.length);
    }

}
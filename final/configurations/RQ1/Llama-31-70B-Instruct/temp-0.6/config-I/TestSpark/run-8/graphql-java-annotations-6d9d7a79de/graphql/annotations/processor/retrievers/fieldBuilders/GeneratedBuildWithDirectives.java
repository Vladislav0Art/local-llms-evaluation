package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildWithDirectives {

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
    public void buildWithDirectives() {
        Annotation annotation1 = mock(Annotation.class);
        when(annotation1.annotationType()).thenReturn((Class) DirectiveJavaAnnotationUtil.class);

        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());
        when(object.getAnnotations()).thenReturn(new Annotation[]{annotation1});

        GraphQLDirective[] result = directivesBuilder.build();

        assertNotNull(result);
        assertEquals(1, result.length);
    }

}
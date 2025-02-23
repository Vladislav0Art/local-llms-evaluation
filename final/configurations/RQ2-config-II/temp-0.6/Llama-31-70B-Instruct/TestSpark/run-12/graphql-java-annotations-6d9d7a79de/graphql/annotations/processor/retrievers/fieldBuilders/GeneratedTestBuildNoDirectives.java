package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildNoDirectives {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Mock
    private DirectiveRegistry directiveRegistry;

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testBuildNoDirectives() {
        when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        when(directiveRegistry.containsKey(anyString())).thenReturn(false);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertThat(directives, is(emptyArray()));
    }

}
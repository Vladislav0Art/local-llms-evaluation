package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

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

    @Test
    public void testBuildDirectives() {
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        when(directiveRegistry.containsKey(anyString())).thenReturn(false);
        when(directiveRegistry.get(anyString())).thenReturn(graphQLDirective);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertThat(directives, is(notNullValue()));
        assertThat(directives, is(not(emptyArray())));
    }

    @Test
    public void testBuildDirectivesThrowException() {
        when(object.getAnnotation(GraphQLDirectives.class)).thenReturn(null);
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);
        when(directiveRegistry.containsKey(anyString())).thenReturn(false);
        when(directiveRegistry.get(anyString())).thenReturn(null);
        directivesBuilder.build();
    }

}
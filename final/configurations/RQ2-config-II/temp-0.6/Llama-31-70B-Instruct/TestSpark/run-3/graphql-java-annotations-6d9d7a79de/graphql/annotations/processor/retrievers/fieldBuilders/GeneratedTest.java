package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    private ProcessingElementsContainer processingElementsContainer;
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        processingElementsContainer = Mockito.mock(ProcessingElementsContainer.class);
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        directivesBuilder = new DirectivesBuilder(object, processingElementsContainer);
    }

    @Test
    public void buildTest1() {
        GraphQLDirective graphQLDirective = Mockito.mock(GraphQLDirective.class);
        GraphQLArgument graphQLArgument = Mockito.mock(GraphQLArgument.class);
        when(graphQLDirective.getArguments()).thenReturn(Collections.singletonList(graphQLArgument));

        when(processingElementsContainer.getDirectiveRegistry()).thenReturn(Collections.singletonMap("directive", Mockito.mock(Directive.class)));
        when(processingElementsContainer.getDirectiveRegistry().get("directive").getDirective()).thenReturn(graphQLDirective);

        GraphQLDirectives graphQLDirectives = Mockito.mock(GraphQLDirectives.class);
        when(graphQLDirectives.value()).thenReturn(new GraphQLDirective[]{graphQLDirective});
        when(graphQLDirectives.value()[0].argumentsValues()).thenReturn(new String[]{"value"
        }

    }
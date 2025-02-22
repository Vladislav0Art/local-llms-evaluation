package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuild {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement mockAnnotatedElement;
    private ProcessingElementsContainer mockProcessingElementsContainer;
    private GraphQLDirective mockGraphQLDirective;

    private GraphQLArgument mockGraphQLArgument;
    private GraphQLArgument.Builder mockGraphQLArgumentBuilder;
    private GraphQLType mockGraphQLType;
    private GraphQLScalarType mockGraphQLScalarType;
    private GraphQLDirective.Builder mockGraphQLDirectiveBuilder;
    private ArgumentDefaultValue mockArgumentDefaultValue;

    @Before
    public void setup() {
        directivesBuilder = new DirectivesBuilder(mockAnnotatedElement, mockProcessingElementsContainer);
        mockGraphQLArgument = Mockito.mock(GraphQLArgument.class);
        mockGraphQLArgumentBuilder = Mockito.mock(GraphQLArgument.Builder.class);
        mockGraphQLType = Mockito.mock(GraphQLType.class);
        mockGraphQLScalarType = Mockito.mock(GraphQLScalarType.class);
        mockGraphQLDirectiveBuilder = Mockito.mock(GraphQLDirective.Builder.class);
        mockArgumentDefaultValue = Mockito.mock(ArgumentDefaultValue.class);
    }

    @Test
    public void testBuild() {
        GraphQLDirectives directives = Mockito.mock(GraphQLDirectives.class);
        GraphQLDirective[] directivesArray = new GraphQLDirective[0];

        when(mockAnnotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(directives);
        when(directives.value()).thenReturn(directivesArray);

        GraphQLDirective[] result = directivesBuilder.build();

        assertNotNull(result);
        assertEquals(0, result.length);
    }

}
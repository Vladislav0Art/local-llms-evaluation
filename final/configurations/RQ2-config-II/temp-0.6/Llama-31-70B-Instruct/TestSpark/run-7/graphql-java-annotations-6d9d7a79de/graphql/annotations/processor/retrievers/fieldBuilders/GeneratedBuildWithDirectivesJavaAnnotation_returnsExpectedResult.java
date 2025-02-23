package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuildWithDirectivesJavaAnnotation_returnsExpectedResult {

    @Test
    public void buildWithDirectivesJavaAnnotation_returnsExpectedResult() {
        // Arrange
        DirectivesBuilder builder = new DirectivesBuilder(mock(AnnotatedElement.class), mock(ProcessingElementsContainer.class));
        GraphQLDirectives directives = mock(GraphQLDirectives.class);
        when(directives.value()).thenReturn(new GraphQLDirective[]{mock(GraphQLDirective.class)});
        when(directives.value()[0].name()).thenReturn("test");
        GraphQLDirective graphQLDirective = mock(GraphQLDirective.class);
        when(graphQLDirective.getName()).thenReturn("test");
        when(graphQLDirective.getArguments()).thenReturn(new ArrayList<>());
        when(directives.value()[0].argumentsValues()).thenReturn(new String[]{"test"
        }

    }
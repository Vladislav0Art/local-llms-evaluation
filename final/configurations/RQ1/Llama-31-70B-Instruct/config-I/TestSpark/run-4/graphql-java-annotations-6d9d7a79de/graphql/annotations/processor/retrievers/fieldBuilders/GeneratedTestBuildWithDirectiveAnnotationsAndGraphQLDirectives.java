package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestBuildWithDirectiveAnnotationsAndGraphQLDirectives {

    @Test
    public void testBuildWithDirectiveAnnotationsAndGraphQLDirectives() {
        // Arrange
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        GraphQLDirective expectedDirective = mock(GraphQLDirective.class);
        when(container.getDirectiveRegistry().containsKey(anyString())).thenReturn(true);
        when(container.getDirectiveRegistry().get(anyString()).getDirective()).thenReturn(expectedDirective);
        GraphQLDirectives graphQLDirectives = mock(GraphQLDirectives.class);
        when(graphQLDirectives.value()).thenReturn(new GraphQLDirective[]{expectedDirective
        }

    }
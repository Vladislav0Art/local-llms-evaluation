package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedBuild_returns_directive_when_multiple_directives_found {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void build_returns_directive_when_multiple_directives_found() {
        // Arrange
        when(annotatedElement.getDirectives()).thenReturn(new GraphQLDirective[]{new GraphQLDirective1(), new GraphQLDirective2()});

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        Directives directives = builder.build();

        // Assert
        assertEquals(Arrays.asList(new GraphQLDirective1(), new GraphQLDirective2()), directives);
    }

}
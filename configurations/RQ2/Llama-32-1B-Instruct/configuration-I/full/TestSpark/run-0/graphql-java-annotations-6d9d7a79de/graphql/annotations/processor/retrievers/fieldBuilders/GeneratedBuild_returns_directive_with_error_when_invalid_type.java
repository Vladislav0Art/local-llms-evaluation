package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedBuild_returns_directive_with_error_when_invalid_type {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void build_returns_directive_with_error_when_invalid_type() {
        // Arrange
        when(annotatedElement.getDirectives()).thenReturn(new GraphQLDirective[]{new GraphQLDirectiveInvalidType()});

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        Directives[] directives = builder.build();

        // Assert
        assertEquals(Arrays.asList(new GraphQLDirectiveInvalidType()), directives);
    }

}
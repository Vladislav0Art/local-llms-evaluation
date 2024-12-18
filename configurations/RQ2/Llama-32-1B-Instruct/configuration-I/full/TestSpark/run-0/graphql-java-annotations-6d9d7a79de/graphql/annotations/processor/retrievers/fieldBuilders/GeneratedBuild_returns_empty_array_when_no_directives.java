package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedBuild_returns_empty_array_when_no_directives {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void build_returns_empty_array_when_no_directives() {
        // Arrange
        when(annotatedElement.getDirectives()).thenReturn(new GraphQLDirective[0]);

        // Act
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        Directives directives = builder.build();

        // Assert
        assertEquals(null, directives);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedBuild_withMockedDirectiveRegistry_returnGraphQLDirectiveArray {

    @Test
    public void build_withMockedDirectiveRegistry_returnGraphQLDirectiveArray() {
        // Arrange
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        // Act
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        // Assert
        assertNotNull(graphQLDirectives);
    }

}
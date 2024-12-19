package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestBuild_ReturnsDirectives {

    MockitoExtension .class
})

public class DirectivesBuilderTest {

    @Test
    public void testBuild_ReturnsDirectives() {
        // Arrange
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        // Act
        GraphQLDirective[] directives = directivesBuilder.build();

        // Assert
        Annulus expectedDirectives = new Annulus();
        for (GraphQLDirective directive : directives) {
            expectedDirectives.getDirectives().add(directive);
        }
    }

}
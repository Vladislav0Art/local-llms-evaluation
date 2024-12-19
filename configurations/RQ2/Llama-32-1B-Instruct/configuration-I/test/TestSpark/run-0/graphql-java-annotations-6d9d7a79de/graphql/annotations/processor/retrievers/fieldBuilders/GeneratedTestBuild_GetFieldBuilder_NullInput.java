package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestBuild_GetFieldBuilder_NullInput {

    MockitoExtension .class
})

public class DirectivesBuilderTest {

    @Test
    public void testBuild_GetFieldBuilder_NullInput() {
        // Arrange
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        // Act
        FieldBuilder fieldBuilder = directivesBuilder.getFieldBuilder();

        // Assert
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AnnotatedElement mockObject;

    @Mock
    private ProcessingElementsContainer mockContainer;

    @Test
    public void buildReturnsCorrectDirectivesTest() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockObject, mockContainer);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        // Assert that result contains the correct directives
    }

    @Test
    public void buildReturnsNullForNoDirectivesTest() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockObject, mockContainer);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertNull(result);
    }

}
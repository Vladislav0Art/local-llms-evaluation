package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLFieldDefinition;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildNoDirectivesTest {

    @Test
    public void buildNoDirectivesTest() {
        // Arrange
        AnnotatedElement mockElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockElement, mockContainer);

        // Act
        GraphQLDirective[] directives = builder.build();

        // Assert
        assertEquals(0, directives.length);
    }

}
package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);

        // Act
        GraphQLDirective[] result = directivesBuilder.build();

        // Assert
        assertEquals(0, result.length);
    }

}
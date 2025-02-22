package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTransformArgsAnnotation {

    @Test
    public void testTransformArgsAnnotation() {
        // Arrange
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);

        // Act
        GraphQLDirective result = directivesBuilder.transformArgs(null, null);

        // Assert
        assertEquals(null, result);
    }

}
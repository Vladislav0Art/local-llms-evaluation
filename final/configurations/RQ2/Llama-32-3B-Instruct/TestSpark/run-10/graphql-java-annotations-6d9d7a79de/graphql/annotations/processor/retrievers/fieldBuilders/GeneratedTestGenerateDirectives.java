package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGenerateDirectives {

    @Test
    public void testGenerateDirectives() {
        // Arrange and Act
        List<Directive> directives = generateDirectives();
        processingElementsContainer.execute(directives);

        // Assert
        assertEquals(2, directives.size());
    }

}
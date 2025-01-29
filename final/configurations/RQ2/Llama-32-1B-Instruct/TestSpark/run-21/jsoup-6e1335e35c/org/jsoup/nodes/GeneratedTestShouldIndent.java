package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestShouldIndent {

    @Test
    public void testShouldIndent() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        boolean indent = MyElement.shouldIndent(out);

        // Assert
        assertTrue(indent);
    }

}
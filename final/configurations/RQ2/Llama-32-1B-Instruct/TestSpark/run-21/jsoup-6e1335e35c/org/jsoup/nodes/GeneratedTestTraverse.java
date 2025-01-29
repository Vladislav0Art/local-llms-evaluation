package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTraverse {

    @Test
    public void testTraverse() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().traverse(out);

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

}
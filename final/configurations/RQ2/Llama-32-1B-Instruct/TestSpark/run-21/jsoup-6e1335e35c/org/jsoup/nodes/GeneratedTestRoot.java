package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRoot {

    @Test
    public void testRoot() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().root();

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

}
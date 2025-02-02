package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedToString_SetsCorrectHtml {

    @Test
    public void toString_SetsCorrectHtml() {
        // Arrange

        // Act and Assert
        TextNode textNode = new TextNode("Hello World");
        String expectedHtml = "<p>Hello World</p>";
        assertEquals(expectedHtml, textNode.toString());
    }

}
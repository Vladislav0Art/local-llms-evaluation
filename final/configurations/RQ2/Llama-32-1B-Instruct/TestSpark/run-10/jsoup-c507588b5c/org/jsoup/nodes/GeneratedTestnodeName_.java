package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTestnodeName_ {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testnodeName_() {
        // Arrange
        String expected = "TextNode";
        String actual = node.nodeName();

        // Act
        String result = actual;

        // Assert
        assertEquals(expected, result);
    }

}
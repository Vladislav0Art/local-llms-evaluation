package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        Document document = new Document();
        Element parent = document.createElement("body");
        parent.appendChild(document.createTextNode(""));
        parent.appendChild(document.createTextNode(""));
        TextNode node = new TextNode("");
        node.parentNode = parent;
        node.outerHtmlHead(new Appendable(), 0, null);

        // Act
        StringBuilder accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();

        // Assert
        assertTrue(accum.toString().contains("    " + "Hello World"));
        assertTrue(accum.toString().contains("    HelloWorld"));
    }

}
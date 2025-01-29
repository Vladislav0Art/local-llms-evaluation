package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetWholeText {

    public Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testGetWholeText() {
        Document document = new Document();
        Element element = document.createElement("div");
        TextNode node = new TextNode(document, "This is a sample text.");
        assertEquals("Hello World", node.getWholeText());
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestIsBlank {

    public Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testIsBlank() {
        Document document = new Document();
        Element element = document.createElement("span");
        TextNode node = new TextNode(document, "");
        assertTrue(node.isBlank());
    }

}
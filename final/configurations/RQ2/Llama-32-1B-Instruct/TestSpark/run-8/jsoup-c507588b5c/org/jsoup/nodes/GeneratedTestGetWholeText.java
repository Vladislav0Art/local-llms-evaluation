package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetWholeText {

    private Document doc = null;

    @Before
    public void setup() {
        // Initialize the document and appendable
        doc = new Document();
        Element root = doc.createElement("html");
        root.setAttribute("lang", "en");
        doc.appendChild(root);
        // Add more elements as needed
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode(doc, "Hello, World!");
        String text = node.getWholeText();
        assertEquals("Hello, World!", text);
    }

}
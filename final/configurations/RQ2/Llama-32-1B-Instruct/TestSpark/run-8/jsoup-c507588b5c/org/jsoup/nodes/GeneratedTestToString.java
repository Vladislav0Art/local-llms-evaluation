package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestToString {

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
    public void testToString() {
        Document doc2 = new Document();
        Element root = doc2.createElement("html");
        root.setAttribute("lang", "en");
        doc2.appendChild(root);
        TextNode node2 = new TextNode(doc2, "Hello, World!");
        assertEquals("text", node2.toString());
    }

}
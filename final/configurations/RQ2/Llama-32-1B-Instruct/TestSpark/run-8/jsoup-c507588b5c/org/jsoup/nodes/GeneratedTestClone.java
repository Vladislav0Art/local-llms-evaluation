package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestClone {

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
    public void testClone() {
        Document doc3 = new Document();
        Element root = doc3.createElement("html");
        root.setAttribute("lang", "en");
        doc3.appendChild(root);
        TextNode node3 = new TextNode(doc3, "Hello, World!");
        assertEquals(node3, new TextNode(doc, node3));
    }

}
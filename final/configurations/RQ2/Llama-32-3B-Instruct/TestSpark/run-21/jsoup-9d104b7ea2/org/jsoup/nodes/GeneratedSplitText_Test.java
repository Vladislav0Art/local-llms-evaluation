package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitText_Test {

    public String trim(String str) {
        return str.trim();
    }

    @Test
    public void splitText_Test() throws Exception {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document doc = new Document("html content"); // Pass a string to the Document constructor
        Element element = doc.head(); // Get the first child of the document
        element.outerHtmlHead(ba); // Call the method on the Element object
        assertEquals("", ba.toString());
    }

}
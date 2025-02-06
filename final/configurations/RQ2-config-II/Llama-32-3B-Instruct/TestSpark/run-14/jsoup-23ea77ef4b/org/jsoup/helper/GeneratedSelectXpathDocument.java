package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathDocument {

    @Test
    public void selectXpathDocument() {
        Document htmlDoc = Document.html("<html><body>Hello World!</body></html>");
        NodeList nodes = htmlDoc.selectXpath("//body", htmlDoc);
        assertNotNull(nodes);
        assertEquals(1, nodes.getLength());
    }

}
package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringDocument {

    @Test
    public void asStringDocument() {
        Document doc = Document.html("<html><body>Hello World!</body></html>");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
        assertEquals("", result);
    }

}
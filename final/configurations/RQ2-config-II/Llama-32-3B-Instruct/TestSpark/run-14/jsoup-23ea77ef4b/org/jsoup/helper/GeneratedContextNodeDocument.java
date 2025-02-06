package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeDocument {

    @Test
    public void contextNodeDocument() {
        Document wDoc = Document.html("<html><body>Hello World!</body></html>");
        Node contextNode = new W3CDom().contextNode(wDoc);
        assertNotNull(contextNode);
        assertTrue(contextNode instanceof Element);
    }

}
package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFromJsoupDocument {

    @Test
    public void fromJsoupDocument() {
        Document htmlDoc = Document.html("<html><body>Hello World!</body></html>");
        Document jsoupDoc = W3CDom.fromJsoup(htmlDoc);
        assertNotNull(jsoupDoc);
        assertEquals("", jsoupDoc.html());
    }

}
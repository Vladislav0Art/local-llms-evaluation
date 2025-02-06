package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocument {

    @Test
    public void convertDocument() {
        Document inDoc = Document.html("<html><body>Hello World!</body></html>");
        Document outDoc = Document.convert(inDoc);
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

}
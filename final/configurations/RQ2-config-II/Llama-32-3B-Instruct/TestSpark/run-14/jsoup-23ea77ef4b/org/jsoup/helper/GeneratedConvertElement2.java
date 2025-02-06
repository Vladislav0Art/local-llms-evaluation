package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElement2 {

    @Test
    public void convertElement2() {
        Element inEle = new Element("div", "Hello World!");
        Document outDoc = new W3CDom().convert(inEle, Document.html());
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

}
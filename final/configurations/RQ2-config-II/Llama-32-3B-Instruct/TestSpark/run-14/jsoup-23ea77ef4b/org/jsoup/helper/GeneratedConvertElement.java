package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElement {

    @Test
    public void convertElement() {
        Element inEle = new Element("div", "Hello World!");
        Document outDoc = W3CDom.fromJsoup(inEle);
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

}
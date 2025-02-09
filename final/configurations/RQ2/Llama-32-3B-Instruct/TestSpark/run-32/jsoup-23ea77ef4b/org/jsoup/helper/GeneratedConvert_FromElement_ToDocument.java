package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedConvert_FromElement_ToDocument {

    @Test
    public void convert_FromElement_ToDocument() throws Exception {
        Element inElement = new Element("div").appendText("Hello");
        Document outDoc = new Document();
        W3CDom.convert(inElement, outDoc);
        assertEquals(1, outDoc.nodes().size());
    }

}
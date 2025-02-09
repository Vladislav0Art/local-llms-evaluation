package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertElementTest {

    @Test
    public void ConvertElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element("p");
        org.w3c.dom.Document out = doc.implementation.createDocument(null, null, null);
        w3cDom.convert(element, out);
        assertEquals(out.getDocumentElement().getTagName(), element.tagName());
    }

}
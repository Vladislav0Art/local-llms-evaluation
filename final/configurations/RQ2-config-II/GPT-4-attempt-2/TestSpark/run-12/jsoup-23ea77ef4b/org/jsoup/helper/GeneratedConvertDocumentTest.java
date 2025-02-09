package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTest {

    @Test
    public void ConvertDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document doc = new Document("test");
        org.w3c.dom.Document out = doc.implementation.createDocument(null, null, null);
        w3cDom.convert(doc, out);
        assertEquals(out.getDocumentElement().getTagName(), doc.tagName());
    }

}
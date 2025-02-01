package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() {
        Document baseDocument = new Document("http://example.com");
        baseDocument.appendElement("div").text("Hello, World!");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document fromJsoupDocument = w3cDom.fromJsoup(baseDocument);
        assertEquals(baseDocument.location(), fromJsoupDocument.getDocumentURI());
    }

}
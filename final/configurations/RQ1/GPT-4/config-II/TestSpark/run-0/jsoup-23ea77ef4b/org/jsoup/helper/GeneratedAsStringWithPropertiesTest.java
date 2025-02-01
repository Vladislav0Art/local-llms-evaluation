package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        String documentAsString = W3CDom.asString(w3cDocument, W3CDom.OutputHtml());
        assertTrue(documentAsString.contains(w3cDocument.getDocumentURI()));
    }

}
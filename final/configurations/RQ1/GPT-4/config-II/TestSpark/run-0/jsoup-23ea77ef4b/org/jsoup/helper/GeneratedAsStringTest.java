package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document convertedDocument = W3CDom.convert(document);
        String convertedString = W3CDom.asString(convertedDocument, null);
        assertTrue(convertedString.contains(convertedDocument.getDocumentURI()));
    }

}
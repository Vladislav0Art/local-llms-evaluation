package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document convertedDocument = W3CDom.convert(document);
        assertEquals("http://example.com", convertedDocument.getDocumentURI());
    }

}
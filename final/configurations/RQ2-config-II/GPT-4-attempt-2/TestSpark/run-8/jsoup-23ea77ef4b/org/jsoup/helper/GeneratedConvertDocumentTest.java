package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document jsoupDocument = new Document("http://example.com");
        org.w3c.dom.Document convertedDocument = W3CDom.convert(jsoupDocument);
        assertNotNull(convertedDocument);
    }

}
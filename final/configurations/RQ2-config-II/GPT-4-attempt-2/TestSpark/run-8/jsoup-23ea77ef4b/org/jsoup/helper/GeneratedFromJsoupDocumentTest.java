package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        Document jsoupDocument = new Document("http://example.com");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document convertedDocument = w3cDom.fromJsoup(jsoupDocument);
        assertNotNull(convertedDocument);
    }

}
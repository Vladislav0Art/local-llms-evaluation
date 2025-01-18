package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.dom.DOMSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentToDocumentTest {

    @Test
    public void convertDocumentToDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document jsoupDocument = new Document("test");
        w3cDom.convert(jsoupDocument, W3CDom.convert(new Document("test")));

        assertNotNull(jsoupDocument);
    }

}
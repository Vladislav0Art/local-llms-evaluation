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

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document jsoupDocument = new Document("test");
        org.w3c.dom.Document document = w3cDom.fromJsoup(jsoupDocument);

        assertNotNull(document);
    }

}
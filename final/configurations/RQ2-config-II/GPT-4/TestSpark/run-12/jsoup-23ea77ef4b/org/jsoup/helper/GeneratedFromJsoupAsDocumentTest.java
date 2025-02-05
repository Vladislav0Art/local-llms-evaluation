package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedFromJsoupAsDocumentTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void fromJsoupAsDocumentTest() {
        Document jsoupDoc = new Document("http://test.com");
        org.w3c.dom.Document xmlDom = w3cDom.fromJsoup(jsoupDoc);

        assertEquals("http://test.com", xmlDom.getDocumentURI());
    }

}
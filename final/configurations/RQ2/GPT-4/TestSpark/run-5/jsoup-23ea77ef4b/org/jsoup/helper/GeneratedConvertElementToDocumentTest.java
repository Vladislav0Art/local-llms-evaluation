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

public class GeneratedConvertElementToDocumentTest {

    @Test
    public void convertElementToDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = new Element("testElement");
        w3cDom.convert(jsoupElement, W3CDom.convert(new Document("test")));

        assertNotNull(jsoupElement);
    }

}
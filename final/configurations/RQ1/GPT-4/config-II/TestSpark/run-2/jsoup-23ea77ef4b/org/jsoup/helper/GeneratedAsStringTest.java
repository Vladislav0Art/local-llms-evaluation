package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document jsoupDoc = new Document("publicId", "systemId");
        Element element = new Element("elementName");
        jsoupDoc.appendChild(element);
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document w3cDoc = dom.fromJsoup(element);
        String serializedDoc = W3CDom.asString(w3cDoc, null);

        assertTrue(serializedDoc.contains("elementName"));
    }

}
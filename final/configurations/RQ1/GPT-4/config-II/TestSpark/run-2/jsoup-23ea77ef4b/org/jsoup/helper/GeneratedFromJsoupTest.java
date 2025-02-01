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

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDocument = new Document("publicId", "systemId");
        Element element = new Element("tag");
        jsoupDocument.appendChild(element);
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document document = dom.fromJsoup(element);

        Node firstChild = document.getFirstChild().getFirstChild();

        assertNotNull(firstChild);
        assertEquals("tag", firstChild.getNodeName());
    }

}
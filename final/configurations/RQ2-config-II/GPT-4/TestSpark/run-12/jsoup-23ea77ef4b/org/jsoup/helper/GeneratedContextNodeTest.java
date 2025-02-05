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

public class GeneratedContextNodeTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        Node resNode = w3cDom.contextNode(xmlDom);

        assertNotNull(resNode);
    }

}
package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        // Create document
        Document document = parse("<html><body>Hello World!</body></html>");

        // Get context node
        Node result = W3CDom.contextNode(document);

        // Assert that it's the html element
        assertEquals("html", result.getNodeName());
    }

}
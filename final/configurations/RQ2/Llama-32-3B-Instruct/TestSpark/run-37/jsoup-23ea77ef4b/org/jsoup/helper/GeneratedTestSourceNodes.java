package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() {
        // Create document
        Document document = parse("<html><body>Hello World!</body></html>");

        // Get context node
        Node result1 = W3CDom.contextNode(document);
        NodeList nodes = W3CDom.sourceNodes(result1);

        // Assert that there's only one source node (the body element)
        assertEquals(1, nodes.getLength());
    }

}
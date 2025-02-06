package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedContextNodeDocumentTest {

    @Test
    public void contextNodeDocumentTest() throws ParserConfigurationException, TransformerException {
        String xml = "<html><body>Hello</body></html>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new java.io.ByteArrayInputStream(xml.getBytes()));
        Node contextNode = org.jsoup.helper.W3CDom.contextNode(doc);
        assertNotNull(contextNode);
    }

}
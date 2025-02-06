package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedConvertDocumentTest1 {

    @Test
    public void convertDocumentTest1() throws ParserConfigurationException, TransformerException {
        String xml = "<html><body>Hello</body></html>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new java.io.ByteArrayInputStream(xml.getBytes()));
        org.jsoup.helper.W3CDom.convert(doc);
    }

}
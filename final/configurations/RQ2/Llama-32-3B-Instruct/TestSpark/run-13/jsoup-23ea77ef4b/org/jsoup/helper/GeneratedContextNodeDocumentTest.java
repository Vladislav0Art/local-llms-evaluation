package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedContextNodeDocumentTest {

    @Test
    public void contextNodeDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream("<html><body>Hello World!</body></html>"));
        Node node = W3CDom.contextNode(doc);
        assertNotNull(node);
    }

}
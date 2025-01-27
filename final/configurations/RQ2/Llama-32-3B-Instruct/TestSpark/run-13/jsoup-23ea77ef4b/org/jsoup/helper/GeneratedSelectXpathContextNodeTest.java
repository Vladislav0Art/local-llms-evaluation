package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedSelectXpathContextNodeTest {

    @Test
    public void selectXpathContextNodeTest() throws Exception {
        String xpath = "//body";
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream("<html><body>Hello World!</body></html>"));
        Node contextNode = doc.getDocumentElement();
        NodeList nodeList = W3CDom.selectXpath(xpath, contextNode);
        assertEquals(1, nodeList.getLength());
    }

}
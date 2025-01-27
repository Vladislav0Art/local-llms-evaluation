package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedSelectXpathDocumentTest {

    @Test
    public void selectXpathDocumentTest() throws Exception {
        String xpath = "//body";
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream("<html><body>Hello World!</body></html>"));
        NodeList nodeList = W3CDom.selectXpath(xpath, doc);
        assertEquals(1, nodeList.getLength());
    }

}
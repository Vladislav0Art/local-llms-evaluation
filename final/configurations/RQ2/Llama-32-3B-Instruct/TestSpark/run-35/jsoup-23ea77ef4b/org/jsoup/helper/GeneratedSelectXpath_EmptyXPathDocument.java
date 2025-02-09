package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedSelectXpath_EmptyXPathDocument {

    @Test
    public void selectXpath_EmptyXPathDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = document.getElementsByTagName("child");
        NodeList selectedNodes = W3CDom.selectXpath("", document);
        assertEquals(0, selectedNodes.getLength());
    }

}
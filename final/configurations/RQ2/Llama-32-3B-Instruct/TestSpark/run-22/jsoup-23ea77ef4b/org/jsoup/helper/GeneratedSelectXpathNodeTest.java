package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        Node contextNode = doc.getDocumentElement();
        NodeList nodeList = W3CDom.selectXpath("//div", contextNode);
        assertEquals(1, nodeList.getLength());
    }

}
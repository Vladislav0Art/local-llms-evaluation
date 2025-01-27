package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSelectXpathDocumentTest {

    @Test
    public void selectXpathDocumentTest() throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element div = doc.createElement("div");
        doc.appendChild(div);
        NodeList nodeList = W3CDom.selectXpath("//div", doc);
        assertEquals(1, nodeList.getLength());
    }

}
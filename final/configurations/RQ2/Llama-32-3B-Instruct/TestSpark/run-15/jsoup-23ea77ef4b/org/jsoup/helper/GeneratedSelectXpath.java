package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import static org.junit.Assert.*;

public class GeneratedSelectXpath {

    @Test
    public void selectXpath() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument();
        NodeList nodeList = doc.getElementsByTagName("div");
        NodeList result = W3CDom.selectXpath("//div", doc);
        assertEquals(nodeList.getLength(), result.getLength());
    }

}
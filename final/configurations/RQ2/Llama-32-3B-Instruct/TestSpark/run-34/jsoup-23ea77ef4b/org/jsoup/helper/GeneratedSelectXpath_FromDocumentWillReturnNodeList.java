package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpath_FromDocumentWillReturnNodeList {

    @Test
    public void selectXpath_FromDocumentWillReturnNodeList() {
        Document doc = new Document();
        NodeList nodeList = doc.getElementsByTagName("div");
        NodeList result = W3CDom.selectXpath("//div", doc);
        assertNotNull(result);
        assertEquals(nodeList.getLength(), result.getLength());
    }

}
package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpath_FromContextNodeWillReturnNodeList {

    @Test
    public void selectXpath_FromContextNodeWillReturnNodeList() {
        Element contextEl = new Element();
        Document doc = new Document();
        doc.appendChild(contextEl);
        NodeList nodeList = W3CDom.selectXpath("//div", contextEl);
        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

}
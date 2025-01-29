package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

public class GeneratedTestSelectXpath {

    @Test
    public void testSelectXpath() {
        W3CDom doc1 = new W3CDom();
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document();
        String xpath1 = "body";
        NodeList nodeList1 = doc1.selectXpath(xpath1, document1);

        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document();
        String xpath2 = "body";
        NodeList nodeList2 = doc1.selectXpath(xpath2, document2);

        assertEquals(nodeList1, nodeList2);
    }

}
package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathDocumentTest_xpathSelection {

    @Test
    public void selectXpathDocumentTest_xpathSelection() {
        Document doc = new org.jsoup.nodes.Document();
        NodeList nodeList = W3CDom.selectXpath("//test", doc);
        assertTrue(nodeList.size() > 0);
    }

}
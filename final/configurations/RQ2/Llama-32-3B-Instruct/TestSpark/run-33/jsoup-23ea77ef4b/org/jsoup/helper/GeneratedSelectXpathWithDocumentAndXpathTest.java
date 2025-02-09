package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathWithDocumentAndXpathTest {

    @Test
    public void selectXpathWithDocumentAndXpathTest() {
        String xpath = "//div";
        Document doc = new org.jsoup.nodes.Document();
        NodeList nodeList = W3CDom.selectXpath(xpath, doc);

        assertNotNull(nodeList);
    }

}
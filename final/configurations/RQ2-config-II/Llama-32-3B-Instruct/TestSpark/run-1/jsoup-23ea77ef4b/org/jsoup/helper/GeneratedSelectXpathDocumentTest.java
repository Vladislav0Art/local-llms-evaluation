package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathDocumentTest {

    @Test
    public void selectXpathDocumentTest() {
        String xpath = "//body";
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        NodeList nodeList = doc.selectXpath(xpath);
        assertNotNull(nodeList);
    }

}
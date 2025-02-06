package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathElementTest {

    @Test
    public void selectXpathElementTest() {
        String xpath = "//body";
        Node contextNode = new org.jsoup.nodes.Document().get(0).selectFirst("body");
        NodeList nodeList = contextNode.selectXpath(xpath);
        assertNotNull(nodeList);
    }

}
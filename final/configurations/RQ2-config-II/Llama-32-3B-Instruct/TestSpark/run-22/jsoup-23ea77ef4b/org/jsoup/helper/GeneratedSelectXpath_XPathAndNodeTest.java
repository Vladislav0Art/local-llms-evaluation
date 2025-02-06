package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedSelectXpath_XPathAndNodeTest {

    @Test
    public void selectXpath_XPathAndNodeTest() {
        String xpath = "//div";
        Node contextNode = new org.jsoup.nodes.Document().selectFirst("div").get(0);
        NodeList result = W3CDom.selectXpath(xpath, contextNode);
        assertNotNull(result);
    }

}
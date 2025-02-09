package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathWithContextNodeAndXpathTest {

    @Test
    public void selectXpathWithContextNodeAndXpathTest() {
        Node contextNode = new org.jsoup.nodes.Element();
        String xpath = "//div";
        NodeList nodeList = W3CDom.selectXpath(xpath, contextNode);

        assertNotNull(nodeList);
    }

}
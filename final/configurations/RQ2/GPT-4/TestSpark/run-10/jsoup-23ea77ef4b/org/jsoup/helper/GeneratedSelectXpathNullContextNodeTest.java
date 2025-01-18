package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedSelectXpathNullContextNodeTest {

    @Test
    public void selectXpathNullContextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Node contextNode = null;
        w3CDom.selectXpath("/html/body/div[1]/div", contextNode);
    }

}
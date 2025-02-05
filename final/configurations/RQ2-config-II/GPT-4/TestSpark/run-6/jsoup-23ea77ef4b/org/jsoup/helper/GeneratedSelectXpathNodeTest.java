package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathNodeTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void selectXpathNodeTest() {
        String xpath = "/example";
        NodeList nodeList = null;
        w3CDom.selectXpath(xpath, nodeList);
    }

}
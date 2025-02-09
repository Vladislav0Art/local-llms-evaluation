package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.HashMap;

public class GeneratedSelectXpathDocumentTest {

    @Test
    public void selectXpathDocumentTest() {
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = new W3CDom().selectXpath("/html/body/div", doc);
        Assert.assertNotNull(nodeList);
    }

}
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

public class GeneratedSelectXpathNodeTest {

    @Test
    public void selectXpathNodeTest() {
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node node = doc.createElement("body");
        doc.appendChild(node);
        NodeList nodeList = new W3CDom().selectXpath("/body", node);
        Assert.assertNotNull(nodeList);
    }

}
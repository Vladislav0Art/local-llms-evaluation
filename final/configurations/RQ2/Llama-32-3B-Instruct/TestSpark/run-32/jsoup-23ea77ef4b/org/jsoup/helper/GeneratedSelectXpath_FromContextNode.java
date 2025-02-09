package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedSelectXpath_FromContextNode {

    @Test
    public void selectXpath_FromContextNode() throws Exception {
        Node contextNode = new Node();
        NodeList nodeList = W3CDom.selectXpath("//div", contextNode);
        assertNotNull(nodeList);
    }

}
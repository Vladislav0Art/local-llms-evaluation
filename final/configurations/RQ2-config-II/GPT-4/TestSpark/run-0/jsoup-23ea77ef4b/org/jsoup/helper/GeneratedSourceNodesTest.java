package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document document = new Document("");
        TextNode textNode = new TextNode("Test", "");
        document.appendChild(textNode);
        javax.xml.parsers.Document w3cDocument = W3CDom.convert(document);
        W3CDom w3cDom = new W3CDom();
        javax.xml.parsers.NodeList nodeList = w3cDom.selectXpath("//text()", w3cDocument);
        List<TextNode> sourceNodes = w3cDom.sourceNodes(nodeList, TextNode.class);
        assertFalse(sourceNodes.isEmpty());
    }

}
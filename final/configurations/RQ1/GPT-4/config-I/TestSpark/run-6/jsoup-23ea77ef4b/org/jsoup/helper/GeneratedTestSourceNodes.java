package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;

import static junit.framework.TestCase.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = new W3CDom().fromJsoup(Jsoup.parse(html));
        javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();
        org.w3c.dom.NodeList nodes = (org.w3c.dom.NodeList) xpath.evaluate("//p", doc, XPathConstants.NODESET);
        assertTrue(new W3CDom().sourceNodes(nodes, TextNode.class).size() > 0);
    }

}
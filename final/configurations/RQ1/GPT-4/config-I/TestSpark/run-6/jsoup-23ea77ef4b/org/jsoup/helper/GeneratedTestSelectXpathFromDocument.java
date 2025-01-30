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

public class GeneratedTestSelectXpathFromDocument {

    @Test
    public void testSelectXpathFromDocument() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = W3CDom.convert(Jsoup.parse(html));
        Node node = (Node) new W3CDom().selectXpath("/html/body/div/p", doc).item(0);
        assertEquals("p", node.getNodeName());
    }

}
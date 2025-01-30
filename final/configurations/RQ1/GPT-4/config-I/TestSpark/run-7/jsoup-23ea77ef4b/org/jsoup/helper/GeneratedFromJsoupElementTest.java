package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        final String html = "<div>Test</div>";
        Element jsoupElement = Jsoup.parse(html).body().child(0);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupElement);

        assertEquals("Test", doc.getElementsByTagName("div").item(0).getTextContent());
    }

}
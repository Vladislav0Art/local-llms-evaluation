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

public class GeneratedAsStringDocumentMapTest {

    @Test
    public void asStringDocumentMapTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);

        HashMap<String, String> properties = new HashMap<>();
        properties.put("doc_type", "html");
        String res = W3CDom.asString(doc, properties);

        assertTrue(res.contains("<div>Test</div>"));
    }

}
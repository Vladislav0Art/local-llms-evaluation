package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.util.Properties;
import java.util.HashMap;
import java.util.Map;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        Document jsoupDocument = new Document("");
        Element element = jsoupDocument.appendElement("element");
        org.w3c.dom.Document w3cDocument = new W3CDom().fromJsoup(element);

        Node node = new W3CDom().contextNode(w3cDocument);
        Assert.assertNull(node);
    }

}
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

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Document jsoupDocument = new Document("");
        Element element = jsoupDocument.appendElement("element");
        element.html("hello world");

        org.w3c.dom.Document w3cDocument = new W3CDom().fromJsoup(element);
        org.w3c.dom.Node parentNode = w3cDocument.getDocumentElement().getFirstChild();

        Assert.assertEquals("element", parentNode.getNodeName());
    }

}
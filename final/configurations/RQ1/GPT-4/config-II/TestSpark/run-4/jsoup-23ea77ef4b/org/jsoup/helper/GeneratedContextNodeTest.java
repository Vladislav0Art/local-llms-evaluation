package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body><p>Hello world</p></body></html>");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        org.w3c.dom.Node node = w3cDom.contextNode(w3cDoc);
        Assert.assertNull(node);
    }

}
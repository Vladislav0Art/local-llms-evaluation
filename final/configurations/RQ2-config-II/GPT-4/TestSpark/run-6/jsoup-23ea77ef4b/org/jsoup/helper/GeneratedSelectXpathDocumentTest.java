package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSelectXpathDocumentTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void selectXpathDocumentTest() {
        String xpath = "/example";
        Document in = new Document("example");
        W3CDocument doc = w3CDom.fromJsoup(in);
        w3CDom.selectXpath(xpath, doc);
    }

}
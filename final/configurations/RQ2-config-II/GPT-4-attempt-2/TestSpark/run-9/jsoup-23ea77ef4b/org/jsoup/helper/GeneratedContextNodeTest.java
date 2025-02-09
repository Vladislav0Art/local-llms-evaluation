package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        W3CDom instance = new W3CDom();
        Document document = Jsoup.parse("<html></html>").ownerDocument();
        org.w3c.dom.Node result = instance.contextNode(document);
        assertNotNull(result);
    }

}
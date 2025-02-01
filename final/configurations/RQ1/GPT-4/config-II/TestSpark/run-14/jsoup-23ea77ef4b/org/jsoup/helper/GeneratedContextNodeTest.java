package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        final org.jsoup.nodes.Document document = Jsoup.parse("<html><head></head><body><div></div></body></html>");
        final W3CDom w3CDom = new W3CDom();
        final Document domDocument = w3CDom.fromJsoup(document);

        final org.w3c.dom.Node contextNode = w3CDom.contextNode(domDocument);
        assertEquals("html", contextNode.getNodeName());
    }

}
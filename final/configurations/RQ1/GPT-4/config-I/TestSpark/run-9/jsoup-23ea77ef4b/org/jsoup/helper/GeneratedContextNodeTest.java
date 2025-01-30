package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div");
            W3CDom w3CDom = spy(W3CDom.class);
            w3CDom.fromJsoup(element);
            assertNotNull(w3CDom.contextNode(doc));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
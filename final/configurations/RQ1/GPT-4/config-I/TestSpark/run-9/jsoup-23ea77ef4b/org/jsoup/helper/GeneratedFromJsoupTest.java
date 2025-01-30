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

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();

        Attributes attributes = new Attributes();
        attributes.put("class", "test");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div");
        W3CDom w3CDom = new W3CDom();
        Document output = w3CDom.fromJsoup(element);
        assertNotNull(output);
    }

}
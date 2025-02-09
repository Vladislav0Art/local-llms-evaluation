package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element("div").text("Hello Jsoup");
        Document result = new W3CDom().fromJsoup(element);
        assertEquals("div", result.getDocumentElement().getNodeName());
    }

}
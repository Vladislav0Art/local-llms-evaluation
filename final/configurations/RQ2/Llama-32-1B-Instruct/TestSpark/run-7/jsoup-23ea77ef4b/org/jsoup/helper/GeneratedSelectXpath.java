package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;
import org.jsoup.util.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringWriter;

public class GeneratedSelectXpath {

    private Document doc = parseString("html");

    @Test
    public void selectXpath() {
        Selector selector = doc.select("body");
        NodeList nodeList = selector.select(":nth-child(1)");
        assertNotNull(nodeList);
        assertTrue(nodeList.getLength() == 1);
        assertTrue((Integer) nodeList.item(0).getNodeName().equals("h1"));
    }

}
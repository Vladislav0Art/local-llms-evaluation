package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() throws ParserConfigurationException {
        Document in = org.jsoup.Jsoup.parse("<html><head><title>Title</title></head><body>Body</body></html>");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document out = w3CDom.fromJsoup(in);
        assertEquals("html", w3CDom.selectXpath("/", out).item(0).getNodeName());
    }

}
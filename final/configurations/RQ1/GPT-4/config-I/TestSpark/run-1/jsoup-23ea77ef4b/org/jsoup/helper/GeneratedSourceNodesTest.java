package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    private static final String SOME_HTML = "<html><head><title>First parse</title></head><body><p>Parsed HTML into a doc.</p></body></html>";

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        Element element = Jsoup.parse(SOME_HTML);
        W3CDom dom = new W3CDom();
        Document document = dom.fromJsoup(element.ownerDocument());
        NodeList nodeList = document.getElementsByTagName("p");
        assertTrue(nodeList.getLength() > 0);
    }

}
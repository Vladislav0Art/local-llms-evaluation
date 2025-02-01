package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() throws ParserConfigurationException, SAXException, IOException {
        Document in = new Document("");
        in.append("<html><body><div id='test'>Hello</div></body></html>");
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document out = dom.fromJsoup(in);
        NodeList nodeList = dom.selectXpath("//div", out);
        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

}
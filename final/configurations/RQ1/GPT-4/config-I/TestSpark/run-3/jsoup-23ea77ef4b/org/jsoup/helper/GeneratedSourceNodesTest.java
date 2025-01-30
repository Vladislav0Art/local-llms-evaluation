package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.transform.TransformerException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        W3CDom w3CDom = new W3CDom();
        NodeList nodes = w3CDom.selectXpath("//body", w3cDoc);
        assertNotNull(w3CDom.sourceNodes(nodes, Element.class));
    }

}
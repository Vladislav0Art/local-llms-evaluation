package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document jsoupDocument = Jsoup.parse("<html><body><div>Test</div><div>AnotherTest</div></body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDocument);
        W3CDom w3cDom = new W3CDom();
        Elements divElements = jsoupDocument.select("div");
        NodeList nodeList = w3cDom.selectXpath("//div", w3cDocument);
        assertNotNull(w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Element.class));
    }

}
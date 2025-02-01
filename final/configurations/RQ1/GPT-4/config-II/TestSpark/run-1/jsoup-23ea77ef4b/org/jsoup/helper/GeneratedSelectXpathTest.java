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

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() throws Exception {
        org.jsoup.nodes.Document jsoupDocument = Jsoup.parse("<html><body><div class=\"test\">Test</div></body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDocument);
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("//div", w3cDocument);
        assertThat(nodeList.getLength(), is(1));
    }

}
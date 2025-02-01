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

public class GeneratedConvertElementTest {

    @Test
    public void convertElementTest() {
        org.jsoup.nodes.Document jsoupDocument = Jsoup.parse("<html><body><div>Test</div></body></html>");
        Document w3cDocument = W3CDom.convert(jsoupDocument);
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(jsoupDocument.body(), w3cDocument);
        Node node = w3cDocument.getElementsByTagName("body").item(0);
        assertNotNull(node);
    }

}
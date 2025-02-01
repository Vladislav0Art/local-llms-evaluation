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

public class GeneratedContextNodeTest {

    @Test
    public void contextNodeTest() {
        org.jsoup.nodes.Element jsoupElement = new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf("body"), "");
        jsoupElement.appendChild(new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf("p"), ""));
        W3CDom w3cDom = new W3CDom();
        Document w3cDocument = w3cDom.fromJsoup(jsoupElement);

        assertNotNull(w3cDom.contextNode(w3cDocument));
    }

}
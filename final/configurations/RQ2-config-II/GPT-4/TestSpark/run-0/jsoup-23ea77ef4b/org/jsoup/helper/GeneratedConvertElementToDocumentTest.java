package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConvertElementToDocumentTest {

    @Test
    public void convertElementToDocumentTest() {
        Element element = new Element("div");
        W3CDom w3cDom = new W3CDom();
        javax.xml.parsers.Document w3cDocument = w3cDom.fromJsoup(element);
        assertNotNull(w3cDocument);
    }

}
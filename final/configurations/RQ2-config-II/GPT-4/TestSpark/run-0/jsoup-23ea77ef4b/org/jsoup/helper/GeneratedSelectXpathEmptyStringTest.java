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

public class GeneratedSelectXpathEmptyStringTest {

    @Test
    public void selectXpathEmptyStringTest() throws XPathExpressionException {
        W3CDom w3cDom = new W3CDom();
        org.jsoup.nodes.Document document = new Document("");
        javax.xml.parsers.Document w3cDocument = W3CDom.convert(document);
        w3cDom.selectXpath("", w3cDocument);
    }

}
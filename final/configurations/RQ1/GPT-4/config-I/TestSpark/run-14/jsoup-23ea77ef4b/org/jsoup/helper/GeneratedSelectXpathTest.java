package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedSelectXpathTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void selectXpathTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        W3CDom w3CDom = new W3CDom();
        javax.xml.xpath.XPath xpath = javax.xml.xpath.XPathFactory.newInstance().newXPath();
        org.w3c.dom.NodeList result = w3CDom.selectXpath("/html/body", w3cDocument);
        Assert.assertEquals(1, result.getLength());
    }

}
package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() throws ParserConfigurationException {
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element(org.jsoup.parser.Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        Document document = w3CDom.fromJsoup(element);
        String documentString = w3CDom.asString(document);
        Assert.assertTrue(documentString.contains("<p>"));
    }

}
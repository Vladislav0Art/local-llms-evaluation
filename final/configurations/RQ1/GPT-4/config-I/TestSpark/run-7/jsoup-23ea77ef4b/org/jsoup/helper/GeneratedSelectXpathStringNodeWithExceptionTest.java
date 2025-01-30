package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedSelectXpathStringNodeWithExceptionTest {

    @Test
    public void selectXpathStringNodeWithExceptionTest() throws XPathExpressionException, XPathFactoryConfigurationException {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);
        Node node = doc.getElementsByTagName("body").item(0);

        XPathFactory xPathFactory = org.mockito.Mockito.mock(XPathFactory.class);
        org.mockito.Mockito.when(xPathFactory.newXPath().compile("//div")).thenThrow(new XPathExpressionException("XPathExpressionException"));

        org.jsoup.helper.W3CDom spyW3cDom = org.mockito.Mockito.spy(w3CDom);
        org.mockito.Mockito.doReturn(xPathFactory).when(spyW3cDom).selectXpath("//div", node);
    }

}
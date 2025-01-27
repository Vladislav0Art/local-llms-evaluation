package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class GeneratedSelectXpath_TakesXPathAndDoc {

    @Test
    public void selectXpath_TakesXPathAndDoc() {
        NodeList expected = W3CDom.selectXpath("//tag", Document.createElement());
        NodeList actual = W3CDom.selectXpath("//tag", Document.createElement());
        assertEquals(expected, actual);
    }

}
package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class GeneratedFromJsoup_TakesElement {

    @Test
    public void fromJsoup_TakesElement() {
        Element element = Document.createElement();
        Document expected = W3CDom.convert(element);
        Document actual = W3CDom.fromJsoup(element);
        assertEquals(expected, actual);
    }

}
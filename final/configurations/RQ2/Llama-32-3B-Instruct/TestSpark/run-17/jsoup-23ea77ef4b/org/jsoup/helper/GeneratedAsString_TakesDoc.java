package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

public class GeneratedAsString_TakesDoc {

    @Test
    public void asString_TakesDoc() {
        Document doc = Document.createElement();
        String output = W3CDom.asString(doc);
        assertNotNull(output);
    }

}
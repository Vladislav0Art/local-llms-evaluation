package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedSelectXpath_RetursNullListWhenEmpty {

    @Test
    public void selectXpath_RetursNullListWhenEmpty() throws Exception {
        NodeList nodeList = W3CDom.selectXpath("", new org.jsoup.nodes.Document());
        assertTrue(nodeList.getLength() == 0);
    }

}
package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedSelectXpath_RetursNonNullListWhenPresent {

    @Test
    public void selectXpath_RetursNonNullListWhenPresent() throws Exception {
        String xpath = "//div";
        NodeList nodeList = W3CDom.selectXpath(xpath, new org.jsoup.nodes.Document());
        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

}
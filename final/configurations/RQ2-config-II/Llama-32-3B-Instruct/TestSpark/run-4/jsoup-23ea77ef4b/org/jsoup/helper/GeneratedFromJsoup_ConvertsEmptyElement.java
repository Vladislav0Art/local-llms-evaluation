package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedFromJsoup_ConvertsEmptyElement {

    @Test
    public void fromJsoup_ConvertsEmptyElement() throws Exception {
        Element elem = new org.jsoup.nodes.Element();
        Document doc = W3CDom.fromJsoup(elem);
        assertNotNull(doc);
    }

}
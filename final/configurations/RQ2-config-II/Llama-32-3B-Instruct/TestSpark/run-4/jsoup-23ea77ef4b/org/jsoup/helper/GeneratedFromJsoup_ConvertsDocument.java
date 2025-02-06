package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedFromJsoup_ConvertsDocument {

    @Test
    public void fromJsoup_ConvertsDocument() throws Exception {
        Document doc = W3CDom.fromJsoup(new org.jsoup.nodes.Document());
        assertNotNull(doc);
    }

}
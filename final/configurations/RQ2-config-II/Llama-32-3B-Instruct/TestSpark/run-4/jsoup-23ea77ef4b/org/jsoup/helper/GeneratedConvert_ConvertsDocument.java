package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedConvert_ConvertsDocument {

    @Test
    public void convert_ConvertsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document out = new W3CDom().convert(in, null);
        assertNull(out);
    }

}
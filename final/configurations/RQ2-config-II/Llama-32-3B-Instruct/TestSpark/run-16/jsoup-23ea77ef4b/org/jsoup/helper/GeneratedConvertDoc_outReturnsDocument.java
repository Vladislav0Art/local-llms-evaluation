package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedConvertDoc_outReturnsDocument {

    @Test
    public void convertDoc_outReturnsDocument() throws Exception {
        Document in = new org.jsoup.nodes.Document();
        Document out = new org.w3c.dom.Document();
        W3CDom.convert(in, out);
        assertTrue(out instanceof org.w3c.dom.Document);
    }

}
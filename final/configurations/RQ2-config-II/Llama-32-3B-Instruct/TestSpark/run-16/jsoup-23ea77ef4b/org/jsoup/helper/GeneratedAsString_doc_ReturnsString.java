package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedAsString_doc_ReturnsString {

    @Test
    public void asString_doc_ReturnsString() throws Exception {
        Document in = W3CDom.convert(new org.jsoup.nodes.Document()); // Mock Jsoup Doc
        String out = W3CDom.asString(in);
        assertNotNull(out);
    }

}
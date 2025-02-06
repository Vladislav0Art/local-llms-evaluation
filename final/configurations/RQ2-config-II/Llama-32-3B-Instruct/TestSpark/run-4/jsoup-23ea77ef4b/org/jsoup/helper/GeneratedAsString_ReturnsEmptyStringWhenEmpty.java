package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

public class GeneratedAsString_ReturnsEmptyStringWhenEmpty {

    @Test
    public void asString_ReturnsEmptyStringWhenEmpty() throws Exception {
        Document doc = new org.jsoup.nodes.Document();
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);
        String xml = writer.toString();
        assertFalse(xml.isEmpty());
    }

}
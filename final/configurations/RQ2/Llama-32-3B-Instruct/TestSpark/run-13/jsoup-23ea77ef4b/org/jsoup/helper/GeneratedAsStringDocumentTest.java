package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream("<html><body>Hello World!</body></html>"));
        String expected = "<html><body>Hello World!</body></html>";
        assertEquals(expected, W3CDom.asString(doc));
    }

}
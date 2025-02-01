package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsStringWithNoPropertiesTest {

    @Test
    public void asStringWithNoPropertiesTest() throws IOException {
        org.jsoup.nodes.Document document = Jsoup.connect("https://www.google.com").get();
        Document converted = W3CDom.convert(document);
        String str = W3CDom.asString(converted, null);
        assertTrue(str.contains("Google"));
    }

}
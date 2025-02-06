package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

}
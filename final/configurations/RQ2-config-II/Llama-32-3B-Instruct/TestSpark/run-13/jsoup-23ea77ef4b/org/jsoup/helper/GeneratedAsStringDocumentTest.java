package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAsStringDocumentTest {

    @Test
    public void asStringDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }
}

class Utils {

    private static Document doc() {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
    }

}
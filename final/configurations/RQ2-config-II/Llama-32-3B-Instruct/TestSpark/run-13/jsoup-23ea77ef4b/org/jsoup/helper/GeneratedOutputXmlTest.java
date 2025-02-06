package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

}
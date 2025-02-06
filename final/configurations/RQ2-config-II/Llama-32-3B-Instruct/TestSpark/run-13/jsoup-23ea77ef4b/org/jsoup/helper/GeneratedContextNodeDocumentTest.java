package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedContextNodeDocumentTest {

    @Test
    public void contextNodeDocumentTest() {
        Document wDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        Node result = W3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

}
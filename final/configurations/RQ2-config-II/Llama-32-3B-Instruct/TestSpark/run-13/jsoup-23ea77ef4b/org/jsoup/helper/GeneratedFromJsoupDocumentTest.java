package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        Document domDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        Document wDoc = W3CDom.fromJsoup(domDoc);
        assertNotNull(wDoc);
    }

}
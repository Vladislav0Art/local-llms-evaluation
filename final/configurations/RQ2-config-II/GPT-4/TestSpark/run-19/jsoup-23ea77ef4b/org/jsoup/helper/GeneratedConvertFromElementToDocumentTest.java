package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertFromElementToDocumentTest {

    @Test
    public void convertFromElementToDocumentTest() {
        Element element = new Element("body");
        org.w3c.dom.Document wDoc = W3CDom.convert(new Document("Test Title"));

        new W3CDom().convert(element, wDoc);

        assertNotNull(wDoc.getElementsByTagName("body").item(0));
    }

}
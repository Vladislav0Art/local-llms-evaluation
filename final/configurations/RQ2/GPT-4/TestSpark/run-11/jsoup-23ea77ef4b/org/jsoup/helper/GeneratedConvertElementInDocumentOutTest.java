package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertElementInDocumentOutTest {

    @Test
    public void convertElementInDocumentOutTest() {
        Document document = new Document("");
        Element element = new Element(Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(element, document);
        assertNotNull(document.body());
    }

}
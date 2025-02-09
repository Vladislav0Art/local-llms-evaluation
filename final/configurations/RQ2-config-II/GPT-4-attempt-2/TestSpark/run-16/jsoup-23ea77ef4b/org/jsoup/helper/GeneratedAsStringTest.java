package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        String result = W3CDom.asString(document, W3CDom.OutputHtml());
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}
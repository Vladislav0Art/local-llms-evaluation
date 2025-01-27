package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoupDocumentWorksCorrectConversion {

    @Test
    public void fromJsoupDocumentWorksCorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        Document doc = W3CDom.fromJsoup(soup);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
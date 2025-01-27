package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertFromJsoupWorks CorrectConversion {

    @Test
    public void convertFromJsoupWorks

    CorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        Document doc = W3CDom.convert(soup);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
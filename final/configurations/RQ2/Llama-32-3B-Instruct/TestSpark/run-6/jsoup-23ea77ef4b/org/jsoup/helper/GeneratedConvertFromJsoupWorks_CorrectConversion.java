package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertFromJsoupWorks_CorrectConversion {

    @Test
    public void convertFromJsoupWorks_CorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        Document doc = W3CDom.fromJsoup(soup);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
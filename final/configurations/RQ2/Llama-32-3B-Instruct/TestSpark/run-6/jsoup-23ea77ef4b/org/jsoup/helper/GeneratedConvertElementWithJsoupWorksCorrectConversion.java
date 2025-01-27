package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertElementWithJsoupWorksCorrectConversion {

    @Test
    public void convertElementWithJsoupWorksCorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        org.jsoup.nodes.Element element = soup.selectFirst("body");
        Document doc = W3CDom.convert(element, soup);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
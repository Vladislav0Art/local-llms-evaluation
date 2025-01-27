package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertElementWorks_CorrectConversion {

    @Test
    public void convertElementWorks_CorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        org.jsoup.nodes.Element element = soup.selectFirst("body");
        W3CDom.convert(element, null);
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

}
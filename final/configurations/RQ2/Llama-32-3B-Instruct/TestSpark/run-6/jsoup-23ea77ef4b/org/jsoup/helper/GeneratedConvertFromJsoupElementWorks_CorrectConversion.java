package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedConvertFromJsoupElementWorks_CorrectConversion {

    @Test
    public void convertFromJsoupElementWorks_CorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        org.jsoup.nodes.Element element = soup.selectFirst("body");
        Document doc = W3CDom.fromJsoup(element);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
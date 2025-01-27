package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedFromElementWorks_CorrectConversion {

    @Test
    public void fromElementWorks_CorrectConversion() throws Exception {
        org.jsoup.nodes.Document soup = org.jsoup.Jsoup.connect("https://www.example.com").getDocument();
        org.jsoup.nodes.Element element = soup.selectFirst("body");
        Document doc = W3CDom.fromJsoup(element);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
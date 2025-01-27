package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoupElementWorks CorrectConversion {

    @Test
    public void fromJsoupElementWorks

    CorrectConversion() throws Exception {
        org.jsoup.nodes.Element element = org.jsoup.Jsoup.connect("https://www.example.com").selectFirst("body");
        Document doc = W3CDom.fromJsoup(element);
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}
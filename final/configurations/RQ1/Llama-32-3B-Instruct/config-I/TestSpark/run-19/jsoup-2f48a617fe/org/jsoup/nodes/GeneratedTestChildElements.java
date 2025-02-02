package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestChildElements {

    @Test
    public void testChildElements() {
        Document doc = new Document();
        Element body = doc.body();
        Elements children = body.children();
        // No child elements are generated for the <body> element
    }

}
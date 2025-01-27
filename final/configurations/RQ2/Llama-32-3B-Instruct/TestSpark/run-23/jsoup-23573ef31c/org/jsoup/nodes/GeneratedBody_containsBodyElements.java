package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedBody_containsBodyElements {

    @Test
    public void body_containsBodyElements() {
        Document document = new Document("https://example.com");
        Elements bodyElements = document.body();
        assertTrue(bodyElements instanceof org.jsoup.nodes.Document);
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedHead_containsHeadElements {

    @Test
    public void head_containsHeadElements() {
        Document document = new Document("https://example.com");
        Elements headElements = document.head();
        assertTrue(headElements instanceof org.jsoup.nodes.Document);
    }

}
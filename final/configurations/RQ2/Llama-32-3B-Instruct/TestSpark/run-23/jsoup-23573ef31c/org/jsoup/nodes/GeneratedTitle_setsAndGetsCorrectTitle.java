package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedTitle_setsAndGetsCorrectTitle {

    @Test
    public void title_setsAndGetsCorrectTitle() {
        String title = "Example Title";
        Document document = new Document("https://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

}
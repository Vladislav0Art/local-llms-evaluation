package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedQuirksMode_setsAndGetsQuirksMode {

    @Test
    public void quirksMode_setsAndGetsQuirksMode() {
        QuirksMode quirksMode = QuirksMode.NORMAL;
        Document document = new Document("https://example.com");
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

}
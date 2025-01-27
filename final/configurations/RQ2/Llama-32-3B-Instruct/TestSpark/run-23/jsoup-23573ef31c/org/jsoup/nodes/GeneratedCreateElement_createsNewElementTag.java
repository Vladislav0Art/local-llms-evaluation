package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedCreateElement_createsNewElementTag {

    @Test
    public void createElement_createsNewElementTag() {
        Document document = new Document("https://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}
package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestAddTags {

    private Document document;

    @BeforeEach
    public void init() {
        document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
    }

    @Test
    public void testAddTags() {
        Safelist addTags = new Safelist().addTags("a", "href=\"https://example.com\"");
        assertTrue(addTags.addAttributes("a", "href", "https://example.com").isSafeTag("a"));
    }

}
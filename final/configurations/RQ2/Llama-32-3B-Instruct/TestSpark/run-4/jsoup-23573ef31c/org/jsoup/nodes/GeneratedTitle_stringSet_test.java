package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedTitle_stringSet_test {

    @Test
    public void title_stringSet_test() {
        Document document = new Document("https://example.com");
        document.title("My Title");
        assertEquals("My Title", document.title());
    }

}
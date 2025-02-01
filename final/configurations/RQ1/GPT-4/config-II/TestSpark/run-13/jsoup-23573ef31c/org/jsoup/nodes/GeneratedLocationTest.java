package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        assertEquals(baseUri, doc.location());
    }

}
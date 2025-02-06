package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCharsetSettingTest {

    @Test
    public void charsetSettingTest() {
        Document document = new Document("http://example.com");
        document.charset("UTF-8");
        assertEquals("UTF-8", document.charset());
    }

}
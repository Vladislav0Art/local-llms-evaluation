package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCharset SetDefaultCharsetTest {

    @Test
    public void charset

    SetDefaultCharsetTest() {
        Document document = new Document("http://example.com");
        Charset defaultCharset = document.charset();
        assertEquals(Charset.getDefaultCharset(), defaultCharset);
    }

}
package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("www.google.com");
        assertEquals(StandardCharsets.UTF_8, document.charset());
        document.charset(StandardCharsets.ISO_8859_1);
        assertEquals(StandardCharsets.ISO_8859_1, document.charset());
    }

}
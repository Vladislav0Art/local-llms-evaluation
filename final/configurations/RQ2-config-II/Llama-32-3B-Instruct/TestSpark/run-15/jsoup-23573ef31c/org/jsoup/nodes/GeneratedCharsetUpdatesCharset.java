package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedCharsetUpdatesCharset {

    @Test
    public void charsetUpdatesCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}
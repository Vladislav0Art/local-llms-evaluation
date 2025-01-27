package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedCharset_setsAndGetsCharset {

    @Test
    public void charset_setsAndGetsCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}
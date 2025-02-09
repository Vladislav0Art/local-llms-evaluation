package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedCharset_SetCharsetReturnsString {

    @Test
    public void charset_SetCharsetReturnsString() {
        Document document = new Document("https://www.example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}
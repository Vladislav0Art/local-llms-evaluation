package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}
package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}
package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        Charset charset = Charset.forName("US-ASCII");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}
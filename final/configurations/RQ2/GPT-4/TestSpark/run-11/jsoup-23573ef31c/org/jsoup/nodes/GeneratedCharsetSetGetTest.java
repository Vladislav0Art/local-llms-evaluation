package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.util.List;

import org.jsoup.parser.Parser;

public class GeneratedCharsetSetGetTest {

    @Test
    public void charsetSetGetTest() {
        Document doc = new Document("http://www.example.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}
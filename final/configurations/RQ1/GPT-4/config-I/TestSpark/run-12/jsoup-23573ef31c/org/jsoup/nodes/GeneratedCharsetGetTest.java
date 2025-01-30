package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

public class GeneratedCharsetGetTest {

    @Test
    public void charsetGetTest() {
        Document doc = Jsoup.parse("<div></div>");
        assertEquals(Charset.forName("UTF-8"), doc.charset());
    }

}
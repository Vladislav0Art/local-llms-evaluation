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

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element e = doc.createElement("div");
        assertEquals("div", e.tagName());
    }

}
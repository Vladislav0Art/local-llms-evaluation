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

public class GeneratedDocumentBaseUriTest {

    @Test
    public void DocumentBaseUriTest() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.location());
    }

}
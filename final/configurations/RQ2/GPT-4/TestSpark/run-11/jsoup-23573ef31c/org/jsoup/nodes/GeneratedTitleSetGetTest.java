package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.util.List;

import org.jsoup.parser.Parser;

public class GeneratedTitleSetGetTest {

    @Test
    public void titleSetGetTest() {
        Document doc = new Document("http://www.example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
    }

}
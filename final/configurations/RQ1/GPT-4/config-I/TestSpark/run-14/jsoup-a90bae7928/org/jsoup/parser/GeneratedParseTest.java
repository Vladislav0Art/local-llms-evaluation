package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.jsoup.Jsoup;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        try {
            XmlTreeBuilder builder = new XmlTreeBuilder();
            Document doc = builder.parse("<p>hello</p>", "http://www.test.com");
            assertEquals("http://www.test.com", doc.baseUri());
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}
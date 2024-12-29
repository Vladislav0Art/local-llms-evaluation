package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseInputStringTest {

    @Test
    public void parseInputStringTest() {
        String html = "<foo></foo>";
        Document document = Jsoup.parse(html, "", Parser.xmlParser());
        assertEquals("foo", document.childNode(0).nodeName());
        assertEquals("", document.baseUri());
    }

}
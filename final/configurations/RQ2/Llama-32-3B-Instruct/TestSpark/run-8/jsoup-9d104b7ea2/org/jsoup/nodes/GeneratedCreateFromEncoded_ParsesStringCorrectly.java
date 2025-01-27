package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_ParsesStringCorrectly {

    @Test
    public void createFromEncoded_ParsesStringCorrectly() throws IOException {
        String html = "<div><span>Hello</span> <span>World!</span></div>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("div > span");
        String[] words = node.attr("text").split("\\s+");
        assertEquals(2, words.length);
    }

}
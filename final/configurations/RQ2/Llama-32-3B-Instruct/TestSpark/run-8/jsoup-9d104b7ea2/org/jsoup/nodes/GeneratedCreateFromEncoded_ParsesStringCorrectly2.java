package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_ParsesStringCorrectly2 {

    @Test
    public void createFromEncoded_ParsesStringCorrectly2() throws IOException {
        String html = "<a>Link 1</a><a>Link 2</a>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("a");
        String[] words = node.attr("text").split("\\s+");
        assertEquals(2, words.length);
    }

}
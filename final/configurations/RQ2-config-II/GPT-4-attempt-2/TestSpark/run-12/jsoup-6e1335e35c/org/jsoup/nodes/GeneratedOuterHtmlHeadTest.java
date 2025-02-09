package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Element element = new Element("div");
        StringBuilder accum = new StringBuilder();
        element.outerHtmlHead(accum, 0, new Document("").outputSettings());
        String html = "<div>";
        assertEquals(html, accum.toString());
    }

}
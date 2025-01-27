package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_EmptyText_ReturnsEmptyString {

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        String html = "<span></span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("text"));
        assertEquals("", node.attr("text").trim());
    }

}
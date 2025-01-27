package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        String html = "<span></span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("nodeName"));
        assertEquals("", node.attr("nodeName").trim());
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        String html = "<span></span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("text"));
        assertEquals("", node.attr("text").trim());
    }

    @Test
    public void text_SimpleText_ReturnsSimpleText() {
        String html = "<span>Hello World</span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("text"));
        assertEquals("Hello World", node.attr("text").trim());
    }

    @Test
    public void text_MultipleSpaces_ReturnsTrimmedText() {
        String html = "<span>   Hello   World  </span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("text"));
        assertEquals("Hello World", node.attr("text").trim());
    }

    @Test
    public void isBlank_EmptyText_ReturnsTrue() {
        String html = "<span></span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("isBlank"));
        assertEquals(true, Boolean.parseBoolean(node.attr("isBlank")));
    }

    @Test
    public void isBlank_SimpleText_ReturnsFalse() {
        String html = "<span>Hello World</span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("isBlank"));
        assertEquals(false, Boolean.parseBoolean(node.attr("isBlank")));
    }

    @Test
    public void createFromEncoded_ParsesStringCorrectly() throws IOException {
        String html = "<div><span>Hello</span> <span>World!</span></div>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("div > span");
        String[] words = node.attr("text").split("\\s+");
        assertEquals(2, words.length);
    }

    @Test
    public void createFromEncoded_ParsesStringCorrectly2() throws IOException {
        String html = "<a>Link 1</a><a>Link 2</a>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("a");
        String[] words = node.attr("text").split("\\s+");
        assertEquals(2, words.length);
    }

}
package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testTextNodeSplitText() throws IOException {
        Document document = Jsoup.parse("<p>Hello World!</p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) child;
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeOuterHtmlHead() throws IOException {
        Document document = Jsoup.parse("<p>Hello World!</p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) child;
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeOuterHtmlTail() throws IOException {
        Document document = Jsoup.parse("<p>Hello World!</p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) child;
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeInnerHtml() throws IOException {
        Document document = Jsoup.parse("<p>Hello <span>World!</span></p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) parentNode.children().first();
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeSplitText2() throws IOException {
        Document document = Jsoup.parse("<p>Hello <span>World!</span></p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) parentNode.children().first();
        assertEquals("Hello ", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeOuterHtmlHead2() throws IOException {
        Document document = Jsoup.parse("<p>Hello <span>World!</span></p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) parentNode.children().first();
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeOuterHtmlTail2() throws IOException {
        Document document = Jsoup.parse("<p>Hello <span>World!</span></p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) parentNode.children().first();
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeInnerHtml2() throws IOException {
        Document document = Jsoup.parse("<p>Hello <span>World!</span></p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode = (TextNode) parentNode.children().first();
        assertEquals("Hello World", StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void testTextNodeInnerHtml3() throws IOException {
        Document document = Jsoup.parse("<p>Hello <span>World!</span></p>");
        Element parentNode = document.body().children().get(0);
        TextNode textNode1 = (TextNode) parentNode.children().first();
        TextNode textNode2 = (TextNode) parentNode.children().last();
        assertEquals("Hello ", StringUtil.normaliseWhitespace(textNode1.text()));
        assertEquals("World!", StringUtil.normaliseWhitespace(textNode2.text()));
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String input) {
        return input.replaceAll("\\s+", " ");
    }

    // This method is deprecated
    private void prettyPrint(OutputSettings settings) {
        // Do nothing
    }

    public static class OutputSettings {
        private boolean prettyPrint = true;
        // Other settings...
    }

}
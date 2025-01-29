package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public static void outerHtmlHead(int start, int end) throws Exception {
        Document doc = new Document();
        Node head = doc.head(start, end);
        if (head == null) throw new Exception("No head");
        assertEquals("text", head.toString());
    }

    public static boolean lastCharIsWhitespace(String text) throws Exception {
        return text.replaceAll("^\\s+", "").equals("");
    }

    @Test
    public void outerHtmlHead_test() throws Exception {
        Document doc = Jsoup.parse("<html><head></head><body>This is a test.</body></html>");
        outerHtmlHead(0, 10);
        assertTrue(doc.outerHtmlHead(1, null).toString().equals("text"));
    }

    @Test
    public void outerHtmlTail_test() throws Exception {
        Document doc = Jsoup.parse("<html><head></head><body>This is a test.</body></html>");
        doc.outputSettings().getTail();
        Node tail = doc.outputSettings().getTail();
        assertEquals("", tail.toString());
    }

    @Test
    public void stripLeadingWhitespace_textNode_test() throws Exception {
        String text = Jsoup.parse("<p>   Hello, World!  </p>").text();
        String trimmedText = text.replaceAll("^\\s+", "");
        assertTrue(text.equals(trimmedText));
    }

    @Test
    public void lastCharIsWhitespaceTextNode_test() throws Exception {
        Node textNode = Jsoup.parse("<span>Hello</span>").span().firstChild();
        boolean firstChar = TextNode.lastCharIsWhitespace(textNode.toString());
        assertFalse(firstChar);
    }

    @Test
    public void stripLeadingWhitespace_textElement_test() throws Exception {
        String text = Jsoup.parse("<span>This is a test.</span><p>   Hello, World!  </p>").text();
        String trimmedText = text.replaceAll("^\\s+", "");
        assertTrue(text.equals(trimmedText));
    }

}
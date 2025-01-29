package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTail_test {

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
    public void outerHtmlTail_test() throws Exception {
        Document doc = Jsoup.parse("<html><head></head><body>This is a test.</body></html>");
        doc.outputSettings().getTail();
        Node tail = doc.outputSettings().getTail();
        assertEquals("", tail.toString());
    }

}
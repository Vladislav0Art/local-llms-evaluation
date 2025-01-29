package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedStripLeadingWhitespace_textElement_test {

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
    public void stripLeadingWhitespace_textElement_test() throws Exception {
        String text = Jsoup.parse("<span>This is a test.</span><p>   Hello, World!  </p>").text();
        String trimmedText = text.replaceAll("^\\s+", "");
        assertTrue(text.equals(trimmedText));
    }

}
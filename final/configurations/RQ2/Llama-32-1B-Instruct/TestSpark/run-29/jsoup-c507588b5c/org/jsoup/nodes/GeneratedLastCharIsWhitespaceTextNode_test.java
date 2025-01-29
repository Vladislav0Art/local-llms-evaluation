package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedLastCharIsWhitespaceTextNode_test {

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
    public void lastCharIsWhitespaceTextNode_test() throws Exception {
        Node textNode = Jsoup.parse("<span>Hello</span>").span().firstChild();
        boolean firstChar = TextNode.lastCharIsWhitespace(textNode.toString());
        assertFalse(firstChar);
    }

}
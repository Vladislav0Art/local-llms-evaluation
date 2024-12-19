package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String text = "This is a test.\nIt has two lines.";
        TextNode node = TextNode.createFromEncoded(text);
        TextNode tail = node.outerHtmlTail(accum, 0, document.OutputSettings());
        assertTrue(tail.text().contains("lines"));
    }

}
package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String text = "This is a test.\nIt has two lines.";
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("TextNode{@node=text, nodeName=#text}", node.toString());
    }

}
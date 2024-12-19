package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String text = "This is a test.\nIt has two lines.";
        TextNode node = TextNode.createFromEncoded(text);
        node.outerHtmlHead(accum, 0, document.OutputSettings());
        assertTrue(accum.toString().contains("test"));
    }

}
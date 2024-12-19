package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String text = "This is a test.\nIt has two lines.";
        TextNode node = TextNode.createFromEncoded(text);
        TextNode clone = (TextNode) node.clone();
        assertTrue(clone.text().equals(node.text()));
    }

}
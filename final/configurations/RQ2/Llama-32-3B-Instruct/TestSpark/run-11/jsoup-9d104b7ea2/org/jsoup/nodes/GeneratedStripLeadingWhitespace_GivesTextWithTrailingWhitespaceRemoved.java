package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedStripLeadingWhitespace_GivesTextWithTrailingWhitespaceRemoved {

    @Test
    public void stripLeadingWhitespace_GivesTextWithTrailingWhitespaceRemoved() {
        String text = "\t\tHello World!";
        TextNode textNode = new TextNode();
        String stripped = TextNode.stripLeadingWhitespace(text);
        Assert.assertEquals("  Hello World!", stripped);
    }

}
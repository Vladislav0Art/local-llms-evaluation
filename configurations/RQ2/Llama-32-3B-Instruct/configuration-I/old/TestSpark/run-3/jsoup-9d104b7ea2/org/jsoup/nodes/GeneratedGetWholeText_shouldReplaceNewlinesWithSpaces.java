package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetWholeText_shouldReplaceNewlinesWithSpaces {

    @Test
    public void getWholeText_shouldReplaceNewlinesWithSpaces() {
        String text = "Hello\nWorld!";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", node.getWholeText());
    }

}
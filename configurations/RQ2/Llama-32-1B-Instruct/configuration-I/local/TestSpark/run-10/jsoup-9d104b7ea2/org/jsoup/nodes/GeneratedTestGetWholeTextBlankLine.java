package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetWholeTextBlankLine {

    @Test
    public void testGetWholeTextBlankLine() {
        TextNode node = new TextNode("\n\nHello World!\n\n");
        assertEquals(node.getText(), "");
    }

}
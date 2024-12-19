package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetWholeTextEmptyString {

    @Test
    public void testGetWholeTextEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

}
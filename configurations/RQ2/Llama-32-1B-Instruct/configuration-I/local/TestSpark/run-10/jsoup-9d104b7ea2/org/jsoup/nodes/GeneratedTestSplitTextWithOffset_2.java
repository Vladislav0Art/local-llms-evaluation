package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestSplitTextWithOffset_2 {

    @Test
    public void testSplitTextWithOffset_2() {
        TextNode node = new TextNode("Hello World");
        assertEquals(new TextNode("<p> <b>Hello</b> <span>World</span></p>"), node.splitText(3));
    }

}
package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestSplitTextWithOffset_1 {

    @Test
    public void testSplitTextWithOffset_1() {
        TextNode node = new TextNode("Hello World");
        assertEquals(new TextNode("<p> Hello  <br> World</p>"), node.splitText(1));
    }

}
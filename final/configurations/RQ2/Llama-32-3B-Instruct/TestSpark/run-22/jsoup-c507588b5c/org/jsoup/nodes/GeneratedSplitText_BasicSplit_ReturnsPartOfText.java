package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.helper.Validate;

public class GeneratedSplitText_BasicSplit_ReturnsPartOfText {

    @Test
    public void splitText_BasicSplit_ReturnsPartOfText() {
        TextNode node = new TextNode("test");
        TextNode result = node.splitText(2);
        assertEquals(node.text(), "est");
    }

}
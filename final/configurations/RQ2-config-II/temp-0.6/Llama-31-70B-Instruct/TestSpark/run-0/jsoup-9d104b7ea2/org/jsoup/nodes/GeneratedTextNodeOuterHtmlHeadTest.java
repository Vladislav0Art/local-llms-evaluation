package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTextNodeOuterHtmlHeadTest {

    @Test
    public void TextNodeOuterHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, null);
        assertEquals("test", sb.toString());
    }

}
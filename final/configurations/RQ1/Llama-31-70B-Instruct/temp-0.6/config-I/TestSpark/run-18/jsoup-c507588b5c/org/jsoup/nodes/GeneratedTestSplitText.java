package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}
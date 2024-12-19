package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitText_GivenTextNodeWithOffset_SplitsCorrectly {

    @Test
    public void splitText_GivenTextNodeWithOffset_SplitsCorrectly() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode tailNode = textNode.splitText(6);
        assertEquals(5, tailNode.text().length());
    }

}
package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.StringUtil;

import java.io.IOException;

public class GeneratedTextNodeIsBlankTest {

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("This is a test");
        assertFalse(textNode.isBlank());
    }

}
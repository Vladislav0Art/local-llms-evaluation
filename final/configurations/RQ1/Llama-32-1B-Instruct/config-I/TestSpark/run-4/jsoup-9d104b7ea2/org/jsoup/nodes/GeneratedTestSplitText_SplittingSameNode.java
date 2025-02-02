package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText_SplittingSameNode {

    public TextNode testBlank() {
        String text = "";
        return new TextNode(text);
    }

    public TextNode testNonBlank() {
        String text = "Hello, world!";
        return new TextNode(text);
    }

    @Test
    public void testSplitText_SplittingSameNode() {
        TextNode node = new TextNode("Hello, world!");
        String text = "Hello, \n world!";
        assertEquals(2, node.splitText(text.length()));
    }

}
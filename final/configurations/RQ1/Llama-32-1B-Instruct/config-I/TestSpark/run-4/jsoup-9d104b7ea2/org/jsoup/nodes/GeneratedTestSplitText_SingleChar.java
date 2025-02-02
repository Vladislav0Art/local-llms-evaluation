package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText_SingleChar {

    public TextNode testBlank() {
        String text = "";
        return new TextNode(text);
    }

    public TextNode testNonBlank() {
        String text = "Hello, world!";
        return new TextNode(text);
    }

    @Test
    public void testSplitText_SingleChar() {
        TextNode node = new TextNode("a");
        assertNotNull(node.splitText(1));
    }

}
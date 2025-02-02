package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToString {

    public TextNode testBlank() {
        String text = "";
        return new TextNode(text);
    }

    public TextNode testNonBlank() {
        String text = "Hello, world!";
        return new TextNode(text);
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello, world!");
        assertEquals("<text> Hello, world! </text>", node.toString());
    }

}